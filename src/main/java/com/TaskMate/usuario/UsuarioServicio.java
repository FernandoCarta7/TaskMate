package com.TaskMate.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> listUsers() {

        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario findByEmail(String email) {
        return usuarioRepositorio.findByEmailOrderByNombre(email);
    }

    @Override
    public Usuario saveUser(Usuario usuario) {
        this.usuarioRepositorio.save(usuario);
        return null;
    }

    @Override
    public void deleteUser(Integer idUsuario) {
        this.usuarioRepositorio.deleteById(idUsuario);
    }
}
