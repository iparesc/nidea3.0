package com.ipartek.formacion.nidea.ejemplos;

public abstract class Circulo extends ObjetoGrafico {

	private int radio;

	public Circulo() {
		super();

		this.radio = 1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar() {
		System.out.println("dibujo el circulo");

	}

	@Override
	public void imprimir() {
		System.out.println("imprimo el circulo por Interfaz");

	}

	public abstract void colorear();

}
