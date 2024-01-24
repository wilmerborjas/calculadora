package com.wbg.examen.app.operaciones;

public class Restar {

	private int restarA;

	private int restarB;

	public void setRestarA(int restarA) {
		this.restarA = restarA;
	}

	public void setRestarB(int restarB) {
		this.restarB = restarB;
	}

	public int getResultado() {
		return this.restarA - this.restarB;
	}

	public int realizarResta(int restarA, int restarB) {
		return restarA - restarB;
	}

}
