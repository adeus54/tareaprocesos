package ec.edu.utpl.tareaProcesos_NelsonAranda.controllers;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restMensaje {

    @GetMapping("/")
    public ResponseEntity<String> restMensaje() {
        String mensaje = "{\"Universidad\": \"UTPL\",\"Curso\": \"Procesos de Ingeniería de Software\"," +
                "\"Alumno\": \"Nelson Alexander Aranda Villa\",\"Período\": \"Abr/Ago 2021\"," +
                "\"Lenguaje de programación preferido\": \"Python\",\"Aspiración PostGraduación\": \"Seguir maestria en IA\"}";

        return ResponseEntity.ok(mensaje);
    }

}
