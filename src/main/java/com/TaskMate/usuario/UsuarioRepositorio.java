package com.TaskMate.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    Usuario findByEmailOrderByNombre(String Email);
}
