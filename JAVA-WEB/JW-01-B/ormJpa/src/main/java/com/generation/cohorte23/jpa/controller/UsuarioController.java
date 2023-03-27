package com.generation.cohorte23.jpa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.jpa.model.UsuarioModel;
import com.generation.cohorte23.jpa.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioServices usuarioService;
	
	@GetMapping()
	public ArrayList<UsuarioModel> ListarUsuarios(){
		return usuarioService.ListarUsuarios();
	}
	
	@PostMapping()
	public UsuarioModel guardarUsuario(RequestBody UsuarioModel usuarioModelo) {
		return usuarioService.guardarUsuario(usuarioModelo);
	}
	
	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerPrioridad (@RequestParam("prioridad")Integer prioridad) {
		return usuarioService.obtenerPorPrioridad(prioridad);
	}
	
}
