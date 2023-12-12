package br.univali.cc.prog3.banco.excecoes;

public class ContasMesmoNumeroException extends Exception {

	public ContasMesmoNumeroException(int numeroConta) {
		super(numeroConta + " Este número de conta já existe!");
	}
}
