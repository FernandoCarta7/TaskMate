package com.TaskMate.usuario;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("TaskMate")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioController {

    private static final Logger logger =
            LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private UsuarioServicio userHelper;

    @GetMapping("/users")
    public List<Usuario> getUsers(){
        //userHelper.getUsuarios();

        return userHelper.listUsers();
    }

    @GetMapping("/userByEmail/{email}")
    public ResponseEntity<Usuario> getUserByEmail(@PathVariable String email){
        Usuario usuario = userHelper.findByEmail(email);
        if ( usuario != null ) return ResponseEntity.ok(usuario);
        else return null;

    }

    @PostMapping("/user/add")
    public ResponseEntity<String> addUser(@RequestBody Usuario usuario){
        Usuario usuario1 = userHelper.findByEmail(usuario.email);


        if (usuario1 != null){
            logger.warn("Usuario no creado, ya existe usuario con el mismo email");
            return ResponseEntity.status(409).body("El correo ya está en uso");
        } else {

            userHelper.saveUser(usuario);
            return ResponseEntity.ok("Usuario creado con éxito");
        }

    }
    /*@PostMapping("/registrarUsuario")
    public void registrarMultiplesUsuarios(){
        GenerarUsuarioAleatorios userRandom = new GenerarUsuarioAleatorios();


        for (int i = 0; i < 1000; i++) {
            Usuario usuario = userRandom.getUserRandom();
            userHelper.save(usuario);

        }
        logger.info("Usuario random");
    }*/
}
