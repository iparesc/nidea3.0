package com.ipartek.formacion.nidea.util;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.nidea.ejemplos.Ordenable;

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

	/**
	 * Ordenar una coleccion con el algoritmo bubble sort, ordena de mayor a menos
	 * basandose en el metodo ordenable
	 * 
	 * @see com.ipartek.formacion.nidea.ejemplos.ordenable
	 * @param coleccion
	 *            List<Ordenable> coleccion con dos elementos a ordenar
	 * @return en caso de null retornamos una lista vacia
	 */
	public static List<Ordenable> bubbleSort(List<Ordenable> coleccion) {
		List<Ordenable> resul = new ArrayList<Ordenable>();

		if (coleccion != null) {
			// TODO implementar metodo bubble sort
			int n = coleccion.size();
			Ordenable temp = null;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < (n - i); j++) {
					if (coleccion.get(j - 1).getValor() > coleccion.get(j).getValor()) {
						// swap elements
						temp = coleccion.get(j - 1);
						coleccion.set(j - 1, coleccion.get(j));
						coleccion.set(j, temp);
					}
				}
				resul = coleccion;
			}
		}
		return resul;

	}

}
