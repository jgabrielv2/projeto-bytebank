package br.com.bytebank.banco.modelo;

/**
 * Exceção lançada quando saldo da conta não for suficiente para a operação requisitada 
 */
public class SaldoInsuficienteException extends RuntimeException {

	
	private static final long serialVersionUID = -5760765422614326251L;
	
	public SaldoInsuficienteException (String msg) {
		super(msg);
	}

}
