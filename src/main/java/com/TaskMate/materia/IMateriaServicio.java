package com.TaskMate.materia;


import java.util.List;

public interface IMateriaServicio {
    public List<Materia> getMaterias();
    public Materia getMateriaById(int id);
    public Materia saveUser(Materia materia);
    public void deleteMateria(Integer id);
}
