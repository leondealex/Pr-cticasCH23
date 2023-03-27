package com.maque.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maque.models.UsuarioModels;
import com.maque.repositories.UsuarioRepositorio;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepositorio usuariorepositorio;

	public boolean eliminarUsuario(Long id) {
		try {
			usuariorepositorio.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public ArrayList<UsuarioModels> ListarUsuarios() {
		return (ArrayList<UsuarioModels>) usuariorepositorio.findAll();
	}

	public UsuarioModels guardarUsuario(UsuarioModels usuario) {
		return usuariorepositorio.save(usuario);
	}

	public Optional<UsuarioModels> obtenerPorId(Long id) {
		return usuariorepositorio.findById(id);
	}
}