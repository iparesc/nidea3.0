package com.ipartek.formacion.nidea.model;

import java.util.ArrayList;

public interface Persistible<P> {

	/**
	 * Lista de una tabla de la base de datos ordenada por id descendente y limitado
	 * a 500
	 * 
	 * @return
	 */
	public ArrayList<P> getAll();

	/**
	 * Obtenemos el detalle de un registro
	 * 
	 * @param id
	 * @return registo si
	 */
	public P getById(int id);

	/**
	 * Guardamos un registro en la base de datos
	 * 
	 * si el id del pojo es== -1 creamos si el id del pojo >1 Modificamos
	 * 
	 * @param pojo
	 * @return
	 */
	public boolean save(P pojo);

	/**
	 * Eliminamos un registro por su identificador
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);
}
