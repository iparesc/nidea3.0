package com.ipartek.formacion.nidea.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.nidea.pojo.Bebida;
import com.ipartek.formacion.nidea.pojo.Material;

public class BebidasDAO implements Persistible<Bebida> {

	@Override
	public ArrayList<Bebida> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bebida getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Bebida pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Bebida mapper(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Material> getAll(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Material> filtrar(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Bebida> filtrar() {
		// TODO Auto-generated method stub
		return null;
	}

}
