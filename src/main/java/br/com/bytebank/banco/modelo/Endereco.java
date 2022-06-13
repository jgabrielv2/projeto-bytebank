package br.com.bytebank.banco.modelo;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade;
	private Estado estado;

	public Endereco(String cep, String logradouro, int numero, String bairro, String cidade, Estado estado) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereço: " + this.cep + ", " + this.logradouro + ", " + this.numero + ", " + this.bairro + ", " + this.cidade + "-" + this.estado;
	}
}
