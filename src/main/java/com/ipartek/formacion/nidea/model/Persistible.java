package com.ipartek.formacion.nidea.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.nidea.pojo.Material;

public interface Persistible<P> {

	/**
	 * Lista de una tabla de la base de datos ordenaod por id descentente y limitado
	 * a 500
	 * 
	 * @return Coleccion
	 */
	public ArrayList<P> getAll();

	public ArrayList<P> filtrar();

	/**
	 * Obtenemos el detalle de un registro
	 * 
	 * @param id
	 *            identificador
	 * @return Registro si existe, null en caso contrario
	 */
	public P getById(int id);

	/**
	 * Guardamos un registro en la BBDD.<br>
	 * Si el id del Pojo == -1 Creamos <br>
	 * Si el id del Pojo > 1 Modificamos
	 * 
	 * @param pojo
	 * @return
	 */
	public boolean save(P pojo);

	/**
	 * Eliminamos un resgistro por su identificador
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * Nos Mapea un Resultado de la BBDD a un Pojo
	 * 
	 * @param rs
	 *            ResultSet 1 registro de la consulta
	 * @return Pojo con los valores del ResultSet o null si no hay valores
	 * @throws SQLException
	 * 
	 */
	public P mapper(ResultSet rs) throws SQLException;

	ArrayList<Material> getAll(int id);

	ArrayList<Material> filtrar(String search);

}