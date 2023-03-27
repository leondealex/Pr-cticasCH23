package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.model.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	public ArrayList<UsuarioModel> ListarUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
	}

	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
		return usuarioRepositorio.findByPrioridad(prioridad);
	}

	
	

	
}
