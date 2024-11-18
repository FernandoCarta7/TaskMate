package com.TaskMate.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedStoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioHelper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void getUsuarios(){
        String procedureCall = "{exec ConsultarUsuarios()}";
        jdbcTemplate.update(
                con -> {
                    var callableStatement = con.prepareCall(procedureCall);
                    return callableStatement;
                }
        );
    }


}
