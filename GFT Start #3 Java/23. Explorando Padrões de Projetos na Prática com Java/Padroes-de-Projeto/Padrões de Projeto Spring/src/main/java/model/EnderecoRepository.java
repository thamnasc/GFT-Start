package model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //não é necessário de colocar 
public class EnderecoRepository extends CrudRepository<Endereco, String> {

}
