package com.TaskMate.semestres;

import java.util.List;

public interface ISemestreServicio {
    public List<Semestre> getSemestres();
    public Semestre getSemestreById(Integer id);
    public Semestre saveSemestre(Semestre semestre);
    public void deleteSemestre(Integer id);
}
