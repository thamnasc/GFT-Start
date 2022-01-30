package service.impl;

import service.Autowired;
import service.Cliente;
import service.ClienteService;
import service.Service;

/**
 * Implementação da Strategy {@link ClienteService}, que pode
 * ser injetada pelo Spring via {@link Autowired}. A classe é
 * {@link Service} e será tratada como Singleton
 * 
 * @author thamnasc
 */

@Service
public class ClienteServiceImpl implements ClienteService {
	
	//Singleton injeta os componentes do Spring com @Autowired
	@Autorired
	private ClienteRepository clienteRepository;
	@Autorired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	//Strategy implementa os métodos definidos na interface
	//Facade abstrai integrações com subsistemas, o que provê uma interface simpçes
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		//Buscar todos os Cl
		
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente buscarPorId(Long id) {
		//Buscar Cliente por ID
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}
	
	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}
	
	@Override
	public void atualizar(Long id, Cliente cliente) {
		
		//buscar cliente por id, se existir:
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		//verifica se o Endereco do Cliente já existe (pelo CEP)
		//caso não exista, integra com o ViaCEP e persiste o retorno
		if(clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}
	
	private void salvarClienteComCep(Cliente cliente) {
		
		//Verifica se o Endereco do Cliente já existe por meio do CEP
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			
			//caso não, integra com o ViaCEP e persiste o retorno
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		//insere Cliente, vinculando o Endereco (novo ou existente)
		clienteRepository.save(cliente);
	}
	
	@Override
	public void deletar(Long id) {
		
		//deleta cliente por ID
		clienteRepository.deleteById(id);
	}
}