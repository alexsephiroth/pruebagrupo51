package co.edu.utp.misiontic2022.c2;


/**
* Universidad Tecnologica de Pereira
* (Pereira, Risaralda - Colombia)
* */
/**
* Clase que representa el Proyecto.
*/
public class Rendimiento {

    private int tiempo;
    private double capital;
    private double interes;
    
    public Rendimiento() {
    this.tiempo=0;
    this.capital=0;
    this.interes=0;
    }
    
    private double calcularInteresCompuesto() {
    return capital * (Math.pow((1+interes), tiempo)-1);
    }
    
    private double calcularInteresSimple() {
    return capital * interes * tiempo ;
    }
    
    public String compararInversion(int ptiempo, double pcapital, double pinteres) {
    
    double respuesta;
    tiempo=ptiempo;
    capital=pcapital;
    interes=pinteres;
    
    respuesta= calcularInteresCompuesto() - calcularInteresSimple();
    respuesta = Math.round(respuesta);
    
    return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $"+respuesta;
    }
    }
    