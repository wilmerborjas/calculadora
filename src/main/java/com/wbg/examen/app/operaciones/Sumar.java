package com.wbg.examen.app.operaciones;

public class Sumar {

	private int numeroA;

	private int numeroB;

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}

	public int getResultado() {
		return this.numeroA + this.numeroB;
	}

	public int realizarSuma(int numeroA, int numeroB) {
		return numeroA + numeroB;

	}

}
