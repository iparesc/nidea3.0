package com.ipartek.formacion.nidea.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.nidea.pojo.Material;
import com.ipartek.formacion.nidea.pojo.Usuario;

public class UsuarioDAO implements Persistible<Usuario> {

	private static UsuarioDAO INSTANCE = null;

	private UsuarioDAO() {

	}

	private synchronized static void createInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UsuarioDAO();
		}
	}

	public static UsuarioDAO getInstance() {
		if (INSTANCE == null) {
			createInstance();
		}
		return INSTANCE;
	}

	@Override
	public ArrayList<Usuario> getAll() {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		String sql = "SELECT `id`, `nombre`, `precio` FROM `usuario` ORDER BY `id` DESC LIMIT 500";
		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();) {
			Usuario u = null;
			while (rs.next()) {
				u = mapper(rs);
				lista.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public ArrayList<Usuario> filtrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getById(int id) {
		Usuario usuario = null;
		String sql = "SELECT `id`, `nombre`, `precio` FROM `material` WHERE `id` = ? ;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, id);
			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					usuario = mapper(rs);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public boolean save(Usuario pojo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario mapper(ResultSet rs) throws SQLException {
		Usuario u = null;
		if (rs != null) {
			u = new Usuario();
			u.setId(rs.getInt("id"));
			u.setNombre(rs.getString("nombre"));
			u.setPassword(rs.getString("password"));
			u.setId_rol(rs.getInt("id_rol"));
		}
		return u;
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

	public Usuario check(String nombre, String password) {
		return null;
	}

}
