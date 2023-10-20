
package atvs.poo;

public class ATVI_Ponto2D {
    public static void main(String[] args) {
        
     Ponto2D p1 = new Ponto2D();
     Ponto2D p2 = new Ponto2D(5.0,12.0);
     Ponto2D p3 = new Ponto2D(p2);
     
     if(p2.equals(p3)){
         System.out.println("Sao iguais");
     }else{
         System.out.println("Sao diferentes");
     }
        System.out.println(p1.getX()+" "+p1.getY());
        p1.movimento(-4.5, 6.0);
        System.out.println(p1.getX()+" "+p1.getY());
        p1.moviemnto();
        System.out.println(p1.getX()+" "+p1.getY());
        System.out.println(p1.toString());
    }
    
}
