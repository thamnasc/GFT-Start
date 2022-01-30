package service;

import com.example.padroesprojetoSpring;

/**
 * Interface que define a Strategy no domínio do cliente.
 * Se for necessário, pode-se ter múltiplas implementações dessa mesma
 * interface
 * 
 *  @author thamnasc
 */

public class ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);
}
