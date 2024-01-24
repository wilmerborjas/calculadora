package com.wbg.examen.app.operaciones;

public class Calculadora {

	public int sumar(int numeroA, int numeroB) {
		return numeroA + numeroB;
	}

	public int restar(int numeroA, int numeroB) {
		return numeroA - numeroB;
	}

	public String multiplicar(int numeroA, int numeroB) {
		int resultado = numeroA * numeroB;

		resultado = resultado + numeroA;
		String mensaje = "multiplicar = " + resultado;

		return mensaje;
	}

}
