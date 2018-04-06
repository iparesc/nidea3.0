package com.ipartek.formacion.nidea.pojo;

public class MetodosABC {

	public static void main(String[] args) {

		int l = 5;
		int b = 7;

		int a = calcularArea(l, b);

		System.out.println("El area es" + " " + a);

	}

	private static int calcularArea(int base, int altura) {
		int area;
		int t = 7;
		area = base * altura;
		int v = calcularVolumen(area, t);
		return area;
	}

	private static int calcularVolumen(int al, int anch) {
		int volumen;
		volumen = al * anch;
		return volumen;
	}

}
