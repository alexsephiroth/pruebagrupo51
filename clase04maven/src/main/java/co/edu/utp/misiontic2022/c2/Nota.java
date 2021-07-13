package co.edu.utp.misiontic2022.c2;

public class Nota{
    //1 atributos (antes las variables estaban sueltas)
    private int escala100;
    private double escala5;
    private String cualitativa;
    private String nombre;//evaluacion,quiz, reto   
    Nota (){
        this.escala100=0;
        this.escala5=0;
        this.cualitativa="";
    }
    
    Nota(pEsacala100){
        this.escala100=pEsacala100;
        this.escala5=pEsacala100/20;

        if{pEscala100 >= 60}{
            this.cualitativa="aprobado";
        }else{
            this.cualitativa="no aprobada";
        }
    }
    
}
