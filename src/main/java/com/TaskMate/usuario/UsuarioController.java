package com.TaskMate.usuario;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("TaskMate")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioController {

    private static final Logger logger =
            LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioHelper userHelper;

    @GetMapping("/Users")
    public void getUsers(){
        userHelper.getUsuarios();
        System.out.println("Llamado del stored procedure desde el controlador");
    }
}
