package com.wbg.examen.app.operaciones;

public class Calculadora {

	public int sumar(int numeroA, int numeroB) {
		return numeroA + numeroB;
	}

	public int restar(int numeroA, int numeroB) {
		return numeroA - numeroB;
	}

	public int multiplicar(int numeroA, int numeroB) {
		return numeroA * numeroB;
	}

	public double descontar10PorCiento(double numeroA, double numeroB) {
		double resultado = numeroA * numeroB;

		double porcentaje = resultado * 0.1;

		resultado = resultado - porcentaje;

		return resultado;
	}

}