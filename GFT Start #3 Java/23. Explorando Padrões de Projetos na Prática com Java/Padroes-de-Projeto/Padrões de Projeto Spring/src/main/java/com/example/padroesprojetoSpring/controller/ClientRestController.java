package com.example.padroesprojetoSpring.controller;

import com.example.padroesprojetoSpring.model.Cliente;
import com.example.padroesprojetoSpring.service.ClienteService;

/**
 * Este {@link RestController} representa a Facade, que abstrai a complexida das
 * integrações (Banco de Dados H2 a API do ViaCEP) para API REST
 * @author thamnasc
 *
 */

@RestController
@RestMapping("clientes")
public class ClientRestController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos() {
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @ResquestBody Cliente cliente) {
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVarible Long id) {
		clienteService.deletar(id);
		return ResponseEntity.ok().build();
	}
	
}
