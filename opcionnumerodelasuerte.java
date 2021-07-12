package co.edu.utp.misiontic2022.c2;

public class opcionnumerodelasuerte{

    public static int obtenernumerodesuerte(String fecha) {
        int numerosuerte=0;
        String [] arreglofecha=fecha.split("/",3);
        int valorDia=Integer.parseInt(arreglofecha[0]);
        int valorMes=Integer.parseInt(arreglofecha[1]);
        int valoraño=Integer.parseInt(arreglofecha[2]);
        int sumapartes=valorDia+valorMes+valoraño;
        while(sumapartes>0){
            numerosuerte+=sumapartes%10;
            sumapartes=(sumapartes/10);
        }
        return numerosuerte;
        
    }
    public static void main(String[] args) {
        System.out.println(obtenernumerodesuerte("12/12/1984"));

        
    }

}