package br.com.bytebank.banco.modelo;

/**
 * Exce��o lan�ada quando saldo da conta n�o for suficiente para a opera��o requisitada 
 */
public class SaldoInsuficienteException extends RuntimeException {

	
	private static final long serialVersionUID = -5760765422614326251L;
	
	public SaldoInsuficienteException (String msg) {
		super(msg);
	}

}
