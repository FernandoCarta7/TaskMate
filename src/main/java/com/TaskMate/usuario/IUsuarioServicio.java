package com.TaskMate.usuario;

import java.util.List;

public interface IUsuarioServicio {

    public List<Usuario> listUsers();
    public Usuario findByEmail();
    public Usuario saveUser(Usuario usuario);
    public void deleteUser();
}