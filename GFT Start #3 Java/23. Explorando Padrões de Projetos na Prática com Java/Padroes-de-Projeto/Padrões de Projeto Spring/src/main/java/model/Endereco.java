package model;

@Entity
public class Endereco {
	
	@Id
	private String cep;
	private String logradouro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	private String bairro;
	
	//evita registros duplicados
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
