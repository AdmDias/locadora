package model;

public class Veiculo {
	private int codigo;
	private String marca;
	private String modelo;
	private String chassi;
	private int ano;
	
	public int getCodigo() {
		return codigo;
	}
		
	public void setCodigo(int c) {
		this.codigo = c;
	}
	
	public String getMarca() {
		return marca;
	}
		
	public void setMarca(String m) {
		this.marca = m;
	}

	public String getModelo() {
		return modelo;
	}
		
	public void setModelo(String m) {
		this.modelo = m;
	}

	public String getChassi() {
		return chassi;
	}
		
	public void setChassi(String c) {
		this.chassi = c;
	}	
		
	public int getAno() {
		return ano;
	}
		
	public void setAno(int a) {
		this.ano = a;
	}
		
}
