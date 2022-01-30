package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository extends CrudRepository<Cliente, Long> {

	//interface que promove todos os métodos de acesso a dados de uma determinada entity
	//CrudRepository é uma strategy
}
