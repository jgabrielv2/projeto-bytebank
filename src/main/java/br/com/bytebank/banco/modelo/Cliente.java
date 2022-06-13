package br.com.bytebank.banco.modelo;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco;

	public Cliente(String nome, String cpf, String profissao, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {

//		return "Cliente: " + this.nome + " CPF: " + this.cpf;
	return String.format("Clienta: %s, CPF: %s", this.nome, this.cpf);
	}
}
