package com.maque.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maque.models.UsuarioModels;

@Repository
public interface UsuarioRepositorio extends CrudRepository<UsuarioModels, Long> {


}