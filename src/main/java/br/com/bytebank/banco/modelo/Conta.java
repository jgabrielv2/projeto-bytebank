package br.com.bytebank.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conta {
	private Cliente titular;
	private Agencia agencia;
	private int numero;
	private BigDecimal saldo = new BigDecimal("0.00");

	public Conta(Agencia agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(BigDecimal valor) {
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Operação não realizada. Valor inválido");
		} else {
			this.saldo = this.saldo.add(valor);
			arredondaValor();
		}
	}

	public void saca(BigDecimal valor) {
		if (valor.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Operação não realizada. Valor inválido");
		} else if (this.saldo.compareTo(valor) <= 0) {
			throw new SaldoInsuficienteException("Operação não realizada. Saldo insuficiente.");
		} else {
			this.saldo = this.saldo.subtract(valor);
			arredondaValor();
		}
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void transfere(Conta outra, BigDecimal valor) {
		this.saca(valor);
		outra.deposita(valor);
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void imprimesaldo() {
		System.out.println("Saldo disponivel: R$ " + this.saldo);
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	private void arredondaValor() {
		this.saldo = this.saldo.setScale(2, RoundingMode.HALF_UP);
	}

	@Override
	public String toString() {

		return this.titular + " Agencia: " + this.agencia + " Numero: " + this.numero;

	}
}
