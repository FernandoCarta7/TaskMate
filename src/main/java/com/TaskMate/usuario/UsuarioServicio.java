package com.TaskMate.usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    UsuarioHelper usuarioHelper;

    @Override
    public List<Usuario> listUsers() {

        usuarioHelper.getUsuarios();

        return null;
    }

    @Override
    public Usuario findByEmail() {
        return null;
    }

    @Override
    public Usuario saveUser(Usuario usuario) {
        return null;
    }

    @Override
    public void deleteUser() {

    }
}
