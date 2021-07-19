package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
    
    Rendimiento r = new Rendimiento();
    String mensaje = r.compararInversion(3, 10000, 0.06);
    System.out.println(mensaje);
    
    }
    
    }