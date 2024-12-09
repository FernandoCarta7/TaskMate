package com.TaskMate.semestres;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("TaskMate")
@CrossOrigin(value = "http://localhost:4200")
public class SemestreController {
    private static final Logger logger = LoggerFactory.getLogger(SemestreController.class);

    @Autowired
    private SemestreServicio semestreServicio;

    @GetMapping("/semestre")
    public List<Semestre> getSemestres(){
        logger.info("---------------OBTENIENDO SEMESTRES---------------");
        return this.semestreServicio.getSemestres();
    }

    @PostMapping("/semestre/registrar")
    public Semestre addSemestre(@RequestBody Semestre semestre){
        logger.info("Agregando semestre");
        Semestre semestre1 = new Semestre();
        this.semestreServicio.saveSemestre(semestre);
        logger.info("Agregando semestre");
        return semestre;

    }
}
