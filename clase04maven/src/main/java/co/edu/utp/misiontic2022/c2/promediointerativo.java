package co.edu.utp.misiontic2022.c2;

import java.time.Period;

public class promediointerativo{
    
    public static double nota_quices(int nota1, int nota2,int nota3, int nota4, int nota5) {
        //declarar variable ,
        double promedioajustado=0;
        int peornota=nota1;
        /*
        if(nota2<peornota){
            peornota=nota2;
        }
        if(nota3<peornota){
            peornota=nota3;
        }
        if(nota4<peornota){
            peornota=nota4;
        }
        if(nota5<peornota){
            peornota=nota5;
        }
        */
        peornota=nota2<peornota ? nota2 : peornota;
        peornota=nota3<peornota ? nota3 : peornota;
        peornota=nota4<peornota ? nota4 : peornota;
        peornota=nota5<peornota ? nota5 : peornota;
        promedioajustado=((nota1+nota2+nota3+nota4+nota5)-peornota)/4;
        promedioajustado=promedioajustado/20;
        return promedioajustado;
    }
    //presentacion
    public static void presentarResultado(String codigo, double resultadopromedio) {
        System.out.println("el promedio ajustado del estudiante " + codigo + "es :" + resultadopromedio);
        
    }
    
    public static void main(String[] args) {
        String codigo="A001";
        double resultadopromedio=nota_quices(40, 50, 39, 76, 96);
        presentarResultado(codigo,resultadopromedio);
        //System.out.println("el promedio ajustado del estudiante " + codigo + "es :" + resultadopromedio);
        
    }

}