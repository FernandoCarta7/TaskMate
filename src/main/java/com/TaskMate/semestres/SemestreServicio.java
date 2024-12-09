package com.TaskMate.semestres;

import com.TaskMate.usuario.IUsuarioServicio;
import com.TaskMate.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemestreServicio implements ISemestreServicio {

    @Autowired
    SemestreRepositorio semestreRepositorio;

    @Override
    public List<Semestre> getSemestres() {
        return this.semestreRepositorio.findAll();
    }

    @Override
    public Semestre getSemestreById(Integer id) {
        
        return this.semestreRepositorio.findById(id).orElse(null);
    }

    @Override
    public Semestre saveSemestre(Semestre semestre) {
        this.semestreRepositorio.save(semestre);

        return semestre;
    }

    @Override
    public void deleteSemestre(Integer id) {
        this.semestreRepositorio.deleteById(id);
    }
}
