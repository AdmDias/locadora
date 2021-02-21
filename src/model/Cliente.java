package model;

public class Cliente {
	private int codCliente;
	private String nomeCliente;
	private String dataNascCliente;
	private String nacionalidade;
	private String sexo;
	private String endereco;
	
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDataNascCliente() {
		return dataNascCliente;
	}
	public void setDataNascCliente(String dataNascCliente) {
		this.dataNascCliente = dataNascCliente;
	}
}
