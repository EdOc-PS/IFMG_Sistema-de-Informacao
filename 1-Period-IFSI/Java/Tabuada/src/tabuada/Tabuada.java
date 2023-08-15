
package tabuada;

public class Tabuada {

    public static void main(String[] args) {
     int numero, total;
     
    /**Scanner TEC = new Scanner(System.in);
     System.out.println("Infforme o numro para ser calculado: ");
     numero = TEC.nextInt();
     **/
    
    for(numero=1; numero<=10; numero++){
    System.out.println("Tabuada do " + numero +": ");
     for(int i=1; i<=10; i++){
        total = numero*i;
        System.out.println(numero+" * " + i +" = "+total);
     }
      System.out.println("");
    }
    }  
}
