package com.ipartek.formacion.nidea.util;

public class Utilidades {

	/**
	 * Metodo estatico para poder usarse desde la propia clase, sin tener que
	 * instanciar un objeto Limpia los caracteres vacios " " de una cadena Hacemos
	 * un trim, ademas de sustituir todos los espacios en blanco por uno
	 * unico,ej<br>
	 * " hola que haxe " hace=>"hola que haxe"
	 * 
	 * @param cadena
	 * @return en caso de null retorna cadena vacia
	 */
	public static String limpiarEspacios(String cadena) {
		String modificado = "";
		if (cadena != null) {

			modificado = cadena.trim();
			modificado = modificado.replaceAll("\\s+", " ");

		}
		return modificado;
	}

	public static String bebidaCorrecta(String cadena) {

		String resul = "";

		if (cadena.length() > 3 && cadena.length() < 45) {

			resul = cadena.trim();
		}

		return resul;

	}
}