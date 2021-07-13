package co.edu.utp.misiontic2022.c2;

public class Nota{
    //1 atributos (antes las variables estaban sueltas)
    private int escala100;
    private double escala5;
    private String cualitativa;
    private String nombre;//evaluacion,quiz, reto   
    //2  
    Nota (){
        this.escala100=0;
        this.escala5=0;
        this.cualitativa="";
    }
    
    Nota(int pEsacala100){
        this.escala100=pEsacala100;
        this.escala5=pEsacala100/20;

        if(pEsacala100 >= 60){
            this.cualitativa="aprobado";
        }else{
            this.cualitativa="no aprobada";
        }
    }
    Nota(double pEsacala5){
        this.escala5=pEsacala5;
        this.escala5=(int)pEsacala5*20;

        if(pEsacala5 >= 2.95){
            this.cualitativa="aprobado";
        }else{
            this.cualitativa="no aprobada";
        }


    }
    Nota(int pEsacala100,double pEsacala5,String pcualitativa){
        this.escala100=pEsacala100;
        this.escala5=pEsacala5;
        this.cualitativa=pcualitativa;
        
    }
    //3  metodos comportamiento
    public void mostrarNotasConsola(){
        System.out.println("------------------");
        System.out.println("------info nota------");
        System.out.println("nota escala100 ");
        System.out.println("valor escala 5 " + this.escala5);
        System.out.println("valor escala 100 " + this.escala100);
        System.out.println("valor cualitativa " + this.cualitativa);
    }

    //4 get y set
    public int getEscala100(){
        return escala100;
    }
    public double getEscala5(){
        return escala5;
    }

    public String getCualitativa() {
        return cualitativa;
    }

    public void setEscala100(int nuevaEscala100){
        this.escala100=nuevaEscala100;
    }

    public void setEscala5(double nuevaEscala5){
        this.escala5=nuevaEscala5;
    }

    public void setCualitativa(String nuevaCualitativa){
        this.cualitativa = nuevaCualitativa;
    }
}


