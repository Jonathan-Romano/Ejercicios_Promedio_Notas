
package com.ejercicio.PromedioNotas.models;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class nota{
    private int nota1;
    private int nota2;
    private int nota3;

    public nota() {
    }

    public nota(int nota1, int nota2, int nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
   

    public int promedio (){        
    return (nota1 + nota2 + nota3) /3;    
    }
}
