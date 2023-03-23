package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.model.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;

@Service

public class UsuarioServices {
	@Autowired
	UsuarioRepositorio usuariorepositorio;

	public ArrayList<UsuarioModel> busquedaPorPrioridad(Integer prioridad) {
		return usuariorepositorio.busquedaPorPrioridad(prioridad);
	}

	public ArrayList<UsuarioModel> ListarUsuarios() {
		return (ArrayList<UsuarioModel>) usuariorepositorio.findAll();
	}

}