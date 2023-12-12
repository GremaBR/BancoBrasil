package br.univali.cc.prog3.banco.excecoes;

public class TransferirEntreContasInexistentesException extends Exception {

	public TransferirEntreContasInexistentesException() {
		super("Contas para transferência não encontradas!");
	}
}
