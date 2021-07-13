package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Nota notavacia = new Nota();
        /*
        System.out.println("notavacia");
        System.out.println("valor escala100 es " + notavacia.getEscala100());
        System.out.println("valor escala5 es " + notavacia.getEscala5());
        System.out.println("valor cualitativa es " + notavacia.getCualitativa());
        */
        notavacia.mostrarNotasConsola();

        Nota notaescala5= new Nota(4.0);
        /*
        System.out.println("nota escala5 ");
        System.out.println("valor escala 5 " + notaescala5.getEscala5());
        System.out.println("valor escala 100 " + notaescala5.getEscala100());
        System.out.println("valor cualitativa " + notaescala5.getCualitativa());
        */
        notaescala5.mostrarNotasConsola();

        Nota notaescala100= new Nota(60);
        /*
        System.out.println("nota escala100 ");
        System.out.println("valor escala 5 " + notaescala100.getEscala5());
        System.out.println("valor escala 100 " + notaescala100.getEscala100());
        System.out.println("valor cualitativa " + notaescala100.getCualitativa());
        */
        notaescala100.mostrarNotasConsola();
        
        Nota notatodos= new Nota(100,5,"aprobado");
        /*
        System.out.println("nota todos ");
        System.out.println("valor escala 5 " + notatodos.getEscala5());
        System.out.println("valor escala 100 " + notatodos.getEscala100());
        System.out.println("valor cualitativa " + notatodos.getCualitativa());
        */
        notatodos.mostrarNotasConsola();
    }
}
