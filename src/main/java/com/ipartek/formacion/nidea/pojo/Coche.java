package com.ipartek.formacion.nidea.pojo;

public class Coche implements AutoCloseable {

	public Coche() {
		super();
		System.out.println("creamos coche");
	}

	public void conducir() {
		System.out.println("brum brum estamos conduciendo");
	}

	@Override
	public void close() throws Exception {
		System.out.println("paramos coche");

	}

	public static void main(String[] args) {

		// si declaramos un objeto que implemente la interfaz Autocloseable
		// dentro de un parentesis de TRY, cuando llega al finally se ejecuta de
		// forma automatica su metodo "close()"

		try (Coche c = new Coche()) {
			System.out.println("empezamos programa");
			c.conducir();

		} catch (Exception e) {
			System.out.println("tenemos una excepcion");
		} finally {
			System.out.println("finalizamos");
		}
	}

}
