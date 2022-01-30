package service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Client HTTP via OpenFeign para consumo da API do ViaCEP
 * 
 * @author thamnasc
 *
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public class ViaCepService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	//@GetMapping("/{cep}/json/")
	Enredeco consultarCep(@PathVariable("cep") String cep);
}
