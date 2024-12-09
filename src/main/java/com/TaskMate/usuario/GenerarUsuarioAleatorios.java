package com.TaskMate.usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GenerarUsuarioAleatorios {
    List<String> nombresHombres = Arrays.asList(
            "Alejandro", "Carlos", "Juan", "Luis", "Miguel", "Jose", "Fernando",
            "Daniel", "Diego", "Javier", "Andres", "Sergio", "Francisco", "Oscar",
            "Eduardo", "Roberto", "Manuel", "Ricardo", "Pablo", "Jorge", "Rafael",
            "Alberto", "Hugo", "Adrian", "Gustavo", "Ivan", "Ramiro", "Victor",
            "Mario", "Antonio", "Gabriel", "Felipe", "Ezequiel", "Cristian",
            "Nicolas", "Sebastian", "Marcelo", "Matias", "Rodrigo", "Raul",
            "Enrique", "Agustin", "Santiago", "Tomas", "angel", "Guillermo",
            "David", "Mauricio", "Martin", "Arturo", "Bruno", "Alfredo",
            "Emanuel", "Emilio", "Elias", "Maximiliano", "Kevin", "Simon",
            "Saul", "Cesar", "Dario", "Pedro", "Ismael", "Benjamin", "Joaquin",
            "Leandro", "Esteban", "Samuel", "Edgar", "Alan", "Cristobal", "Braulio",
            "Jacobo", "Lorenzo", "Vicente", "Ruben", "Fabian", "Rodolfo", "alvaro",
            "Patricio", "Julian", "Teodoro", "Alexis", "Ignacio", "Israel",
            "Jeremias", "Fausto", "Arnoldo", "Rene", "Salvador", "Claudio",
            "Anibal", "Tobias", "Leonardo", "Ernesto", "Eugenio", "Abelardo",
            "Camilo", "Hermes", "Alonso", "Brayan"
    );
    List<String> nombresMujeres = Arrays.asList(
            "Maria", "Ana", "Isabel", "Laura", "Carolina", "Sofia", "Gabriela",
            "Andrea", "Lucia", "Valeria", "Monica", "Diana", "Claudia", "Rosa",
            "Patricia", "Carmen", "Mariana", "Alejandra", "Fernanda", "Paula",
            "Camila", "Veronica", "Silvia", "Elena", "Beatriz", "Angelica",
            "Viviana", "Susana", "Daniela", "Victoria", "Rebeca", "Adriana",
            "Alicia", "Liliana", "Nancy", "Tatiana", "Lorena", "Gloria", "Juana",
            "Raquel", "Marta", "Clara", "Ines", "Cristina", "Pilar", "Elsa",
            "Natalia", "Estefania", "Luciana", "Araceli", "Rocio", "Emilia",
            "Leticia", "Magdalena", "Irene", "Florencia", "Teresa", "Celeste",
            "Marisol", "Fatima", "Consuelo", "Noelia", "Yolanda", "Belen",
            "Matilde", "Luz", "Amelia", "Graciela", "angela", "Paloma", "Ruth",
            "Eugenia", "Milagros", "Romina", "Estela", "Julia", "Carla", "Miranda",
            "Eva", "Olga", "Sandra", "Regina", "Maribel", "Josefina", "Antonia",
            "Zoe", "Brenda", "Nadia", "Maritza", "agata", "Cristal", "Melissa",
            "Elisa", "Helena", "Sara", "Amanda", "africa", "Norma", "Tatiana",
            "Julieta", "Dolores", "Barbara"
    );
    List<String> apellidosLatinos = Arrays.asList(
            "Garcia", "Martinez", "Lopez", "Hernandez", "Gonzalez", "Perez",
            "Rodriguez", "Sanchez", "Ramirez", "Torres", "Flores", "Gomez",
            "Morales", "Vargas", "Jimenez", "Cruz", "Diaz", "Ramos", "Castillo",
            "Ortiz", "Moreno", "Silva", "Romero", "Alvarez", "Mendoza", "Reyes",
            "Rojas", "Guerrero", "Medina", "Cabrera", "Ruiz", "Castro", "Salazar",
            "Soto", "Aguilar", "Pineda", "Delgado", "Figueroa", "Rangel", "Carrillo",
            "Navarro", "Campos", "Vega", "Peña", "Dominguez", "Valencia", "Bautista",
            "Cortes", "Padilla", "Escobar", "Aguirre", "Cervantes", "Mora", "Serrano",
            "Barrera", "Velazquez", "Cardenas", "Maldonado", "Rivas", "Esquivel",
            "Luna", "Cordero", "Nieto", "Villanueva", "Sandoval", "Olivares",
            "Arellano", "avila", "Arroyo", "Fuentes", "Trejo", "Palacios", "Lara",
            "Calderon", "Quintero", "Acosta", "Mejia", "Zamora", "Montes", "Montero",
            "Rosales", "Sosa", "Muñoz", "Valdez", "Espinoza", "Nuñez", "Pacheco",
            "Benitez", "Alvarado", "Barrios", "Guevara", "Camacho", "Montoya",
            "Marquez", "Hidalgo", "Tellez", "Castañeda", "Villalobos", "Vasquez",
            "Solis", "Orozco", "Campos"
    );
    List<String> extensionesCorreo = Arrays.asList(
            "@gmail.com",
            "@yahoo.com",
            "@hotmail.com",
            "@outlook.com",
            "@icloud.com",
            "@aol.com",
            "@protonmail.com",
            "@zoho.com",
            "@gmx.com",
            "@mail.com"
    );
    /*
    public Usuario getUserRandom(){
        Usuario user = new Usuario();
        Random random = new Random();
        int posicionRandom = 0;
        int numero = random.nextInt(1,10);
        String email = "";
        String password = "";

        if (numero <= 5){
            posicionRandom = random.nextInt(0,nombresMujeres.size());
            user.nombre = nombresMujeres.get(posicionRandom).toUpperCase();
            email = nombresMujeres.get(posicionRandom);

            posicionRandom = random.nextInt(0,nombresMujeres.size());
            user.nombre = user.nombre + " " + nombresMujeres.get(posicionRandom).toUpperCase();

            posicionRandom = random.nextInt(0,apellidosLatinos.size());
            user.nombre = user.nombre + " " + apellidosLatinos.get(posicionRandom).toUpperCase();
            email = email + apellidosLatinos.get(posicionRandom);

            posicionRandom = random.nextInt(0,apellidosLatinos.size());
            user.nombre = user.nombre + " " + apellidosLatinos.get(posicionRandom).toUpperCase();

            posicionRandom = random.nextInt(0, extensionesCorreo.size());
            user.email = email + extensionesCorreo.get(posicionRandom);

            user.genero = "FEMENINO";
        }else {
            posicionRandom = random.nextInt(0,nombresHombres.size());
            user.nombre = nombresHombres.get(posicionRandom).toUpperCase();
            email = nombresHombres.get(posicionRandom);

            posicionRandom = random.nextInt(0,nombresHombres.size());
            user.nombre = user.nombre + " " + nombresHombres.get(posicionRandom).toUpperCase();

            posicionRandom = random.nextInt(0,apellidosLatinos.size());
            user.nombre = user.nombre + " " + apellidosLatinos.get(posicionRandom).toUpperCase();
            email = email + apellidosLatinos.get(posicionRandom);

            posicionRandom = random.nextInt(0,apellidosLatinos.size());
            user.nombre = user.nombre + " " + apellidosLatinos.get(posicionRandom).toUpperCase();

            posicionRandom = random.nextInt(0, extensionesCorreo.size());
            user.email = email.toLowerCase() + extensionesCorreo.get(posicionRandom);

            user.genero = "MASCULINO";
        }

        numero = random.nextInt(1,1000);

        if ( numero % 21 == 0 ){
            user.perfil = "PROFESOR";
        }else {
            user.perfil = "ESTUDIANTE";
        }

        List<String> listaCaracteres = new ArrayList<>();

        // Agregar letras minusculas
        for (char c = 'a'; c <= 'z'; c++) {
            listaCaracteres.add(String.valueOf(c));
        }

        // Agregar letras mayusculas
        for (char c = 'A'; c <= 'Z'; c++) {
            listaCaracteres.add(String.valueOf(c));
        }

        // Agregar caracteres especiales
        String caracteresEspeciales = "-()*+*[]{}";
        for (int i = 0; i < caracteresEspeciales.length(); i++) {
            listaCaracteres.add(String.valueOf(caracteresEspeciales.charAt(i)));
        }

        for (int i = 0; i < 16; i++) {
            numero = random.nextInt(0 , listaCaracteres.size());
            password = password + listaCaracteres.get(numero);
        }

        user.password = password;

        int year = random.nextInt(1990,2005);
        int month = random.nextInt(1,13);
        int day = random.nextInt(1,29);
        LocalDate fechaNacimiento = LocalDate.of(year, month, day);

        user.fecha_nacimiento = fechaNacimiento;
        return user;
    }
*/

}
