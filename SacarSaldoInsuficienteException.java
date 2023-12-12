package br.univali.cc.prog3.banco.excecoes;

public class SacarSaldoInsuficienteException extends Exception {
	
	public SacarSaldoInsuficienteException(double saldo, double saque){
		super("Impossível sacar a quantia de " + saque + " pois o seu saldo é de " + saldo + "!");
	}
}
