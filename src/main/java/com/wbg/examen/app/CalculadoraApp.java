package com.wbg.examen.app;

import com.wbg.examen.app.operaciones.Calculadora;
import com.wbg.examen.app.operaciones.Multiplicar;
import com.wbg.examen.app.operaciones.Restar;
import com.wbg.examen.app.operaciones.Sumar;

public class CalculadoraApp {

	public static void main(String[] args) {
//
//		Sumar sumar = new Sumar();
//		sumar.setNumeroA(120);
//		sumar.setNumeroB(1120);
//
//		System.out.println("Sumar = " + sumar.getResultado());
//
//		System.out.println("Sumar 2 = " + sumar.realizarSuma(2, 2));
//
//		Restar restar = new Restar();
//		restar.setRestarA(22);
//		restar.setRestarB(18);
//
//		System.out.println("Restar = " + restar.getResultado());
//
//		System.out.println("restar 2 = " + restar.realizarResta(10, 5));
//
//		Multiplicar multiplicar = new Multiplicar();
//		multiplicar.setNumeroA(5);
//		multiplicar.setNumeroB(10);
//
//		System.out.println("Multiplicar = " + multiplicar.getResultado());
//
//		System.out.println("multiplicar 2= " + multiplicar.realizarMultiplicacion(10, 10));

		Calculadora calculadora = new Calculadora();

		System.out.println("sumar = " + calculadora.sumar(2, 2));

		System.out.println("restar = " + calculadora.restar(10, 4));

		System.out.println("multiplicar = " + calculadora.multiplicar(5, 10));

		System.out.println("resultado descuento = " + calculadora.descontar10PorCiento(85, 95));
		
		System.out.println("total factura = " + calculadora.sumar(255, 110));

	}

}
