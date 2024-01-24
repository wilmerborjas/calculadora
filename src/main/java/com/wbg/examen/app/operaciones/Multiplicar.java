package com.wbg.examen.app.operaciones;

public class Multiplicar {

	private int numeroA;

	private int nemeroB;

	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}

	public void setNumeroB(int numeroB) {
		this.nemeroB = numeroB;
	}

	public int getResultado() {
		return this.numeroA * this.nemeroB;
	}

	public int realizarMultiplicacion(int numeroA, int numeroB) {
		return numeroA * numeroB;
	}
}
