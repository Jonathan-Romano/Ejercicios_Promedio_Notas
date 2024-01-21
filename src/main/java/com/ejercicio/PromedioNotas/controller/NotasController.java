package com.ejercicio.PromedioNotas.controller;

import com.ejercicio.PromedioNotas.models.nota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotasController {

    @GetMapping ("/promedio")
    public String promedio(@RequestParam int nota1,
                           @RequestParam int nota2,
                           @RequestParam int nota3){
    
    nota notas = new nota(nota1, nota2, nota3);
        
    return "tu nota es " + notas.promedio();    
    }
}
