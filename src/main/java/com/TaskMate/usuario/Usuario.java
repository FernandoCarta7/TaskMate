package com.TaskMate.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table (name = "Usuario")
public class Usuario {
    String nombre;
    String email;
    String contraseña;
    String perfil;
}
