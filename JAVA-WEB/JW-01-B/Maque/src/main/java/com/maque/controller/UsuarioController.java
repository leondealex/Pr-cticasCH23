package com.maque.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maque.models.UsuarioModels;
import com.maque.services.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	@DeleteMapping(path = "{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = usuarioService.eliminarUsuario(id);
		if (ok) {
			return "Se elimino el usuario " + id;
		} else {
			return "No se elimino el usuario " + id;
		}
	}

	@GetMapping()
	public ArrayList<UsuarioModels> ListarUsuarios() {
		return usuarioService.ListarUsuarios();
	}

	@PostMapping()
	public UsuarioModels guardarUsuario(@RequestBody UsuarioModels usuarioModelo) {
		return usuarioService.guardarUsuario(usuarioModelo);

	}

	@GetMapping(path = "{id}")
	public Optional<UsuarioModels> obtenerUsuarioPorId(@PathVariable("id") Long id) {
		return usuarioService.obtenerPorId(id);
	}
}