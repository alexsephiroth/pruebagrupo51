package co.edu.utp.misiontic2022.c2;


public class Materia{
    //atributos
    private String nombre;
    private double promedioAjustado;
    private double promedio;
    private String promedioCualitativo;
    private String promedioCualitativoAjustado;
    private Nota nota1;
    private Nota nota2;
    private Nota nota3;
    private Nota nota4;
    private Nota nota5;
    private Nota notaExcluida;//peor nota
    private Nota mejorNota;
    //metodos constructores
    Materia(){
        this.nombre="sin nombre";
        this.promedioAjustado=0.0;
        this.promedio=0.0;
        this.promedioCualitativo="";
        this.promedioCualitativoAjustado="";
        this.nota1=new Nota();
        this.nota2=new Nota();
        this.nota3=new Nota();
        this.nota4=new Nota();
        this.nota5=new Nota();
        this.notaExcluida=new Nota();
        this.mejorNota=new Nota();

    }
    public Materia(int pnota1_100, int pnota2_100, int pnota3_100, int pnota4_100, int pnota5_100) {
        this.nombre="sin nombre";
        this.promedioAjustado=0.0;
        this.promedio=0.0;
        this.promedioCualitativo="";
        this.promedioCualitativoAjustado="";
        this.nota1 = new Nota(pnota1_100);
        this.nota2 = new Nota(pnota2_100);
        this.nota3 = new Nota(pnota3_100);
        this.nota4 = new Nota(pnota4_100);
        this.nota5 = new Nota(pnota5_100);
        this.notaExcluida=new Nota();
        this.mejorNota=new Nota();
    }
    //metodos    
    public void mostrarMateria() {
        System.out.println("-----------materia--------");
        System.out.println("nombre : "+ this.nombre);
        System.out.println("notas : ");
        this.nota1.mostrarNotasConsola();
        this.nota2.mostrarNotasConsola();
        this.nota3.mostrarNotasConsola();
        this.nota4.mostrarNotasConsola();
        this.nota5.mostrarNotasConsola();
        System.out.println("peor nota : "+ this.notaExcluida);
        
    }

    

    


    




   

    
}
