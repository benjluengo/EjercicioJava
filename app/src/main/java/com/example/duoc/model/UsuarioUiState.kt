package com.example.duoc.model

// Modelo que representa el estado del formulario del usuario
data class UsuarioUiState(
    val nombre: String = "",                        // Nombre del usuario
    val correo: String = "",                        // Correo electronico
    val clave: String = "",                         // Contraseña
    val direccion: String = "",                     // Direccion del usuario
    val aceptaTerminos: Boolean = false,            // Confirmación de términos
    val errores: UsuarioErrores = UsuarioErrores()  // Objeto que contiene los errores por campo
)

