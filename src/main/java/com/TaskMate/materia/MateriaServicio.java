package com.TaskMate.materia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaServicio implements IMateriaServicio {

    @Autowired
    MateriaRepositorio materiaRepositorio;


    @Override
    public List<Materia> getMaterias() {
        return this.materiaRepositorio.findAll();
    }

    @Override
    public Materia getMateriaById(int id) {
        return this.materiaRepositorio.findById(id).orElse(null);
    }

    @Override
    public Materia saveUser(Materia materia) {
        return this.materiaRepositorio.save(materia);
    }

    @Override
    public void deleteMateria(Integer id) {
        this.materiaRepositorio.deleteById(id);
    }
}
