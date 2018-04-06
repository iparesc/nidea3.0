package com.ipartek.formacion.nidea.pojo;

public class LlamadasSimple {

	public static void main(String[] args) {
		metodoA();
		System.out.println("estoy metodo A");
	}

	private static void metodoA() {

		metodoB();
		System.out.println("llamo a metodo B");
		// TODO Auto-generated method stub

	}

	private static void metodoB() {

		metodoC();
		System.out.println("llamo a metodo c");

		// TODO Auto-generated method stub

	}

	private static void metodoC() {

		Hoy.diaHoy();// TODO Auto-generated method stub

	}

}
