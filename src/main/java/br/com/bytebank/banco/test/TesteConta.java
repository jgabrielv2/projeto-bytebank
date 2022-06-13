package br.com.bytebank.banco.test;
import java.math.BigDecimal;

import br.com.bytebank.banco.modelo.Agencia;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Endereco;
import br.com.bytebank.banco.modelo.Estado;

public class TesteConta {
	public static void main(String[] args) {
		Cliente joao = new Cliente("João Gabriel", "156.215.547-08", "Programador",
				new Endereco("71555-043", "QE 1 Bloco G apt 207", 0, "Guará 1", "Brasília", Estado.DF));
		Conta contaJoao = new ContaCorrente(Agencia.AG_0001, 5224);
		System.out.println(joao);
		contaJoao.setTitular(joao);
		System.out.println(contaJoao);
		System.out.println(joao.getEndereco());
		
		contaJoao.deposita(new BigDecimal("12480.00"));
		contaJoao.imprimesaldo();
	}
}
