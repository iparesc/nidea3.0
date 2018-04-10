package com.ipartek.formacion.nidea.ejemplos;

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
		String modificado = " hola    que   haxe    ";
		modificado = modificado.trim();
		modificado = modificado.replaceAll("\\s", "");

		return modificado;
	}

}
