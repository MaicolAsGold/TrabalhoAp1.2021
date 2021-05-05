package br.com.poo.modelo;

public class Ingresso {
	private int qnt;
	private double valor;
	private double preco;
	public int x;

	public Ingresso(int qnt, double valor) {
		this.qnt = qnt;
		this.valor = valor;
	}

	public int comprar(int comp) {
		qnt = (qnt - comp);
		return qnt;
	}

	public int qnting(int x) {
		this.x = x;
		return x;
	}

	public double preco() {
		preco = (x * valor);
		return preco;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	

}
