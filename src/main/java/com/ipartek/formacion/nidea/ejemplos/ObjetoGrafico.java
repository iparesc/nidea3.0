package com.ipartek.formacion.nidea.ejemplos;

public abstract class ObjetoGrafico implements Imprimible {

	int x, y;

	public ObjetoGrafico() {
		super();
		System.out.println("Creo el padre");
	}

	public abstract void dibujar();

	{

		System.out.println("Creo el metodo abstractos para los hijos");

	}

}
