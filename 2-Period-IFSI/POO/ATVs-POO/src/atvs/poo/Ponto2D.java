
package atvs.poo;

/**
 * @author 0057138
 */

public class Ponto2D {

    private double x, y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ponto2D (Ponto2D obj){
        this.x = obj.getX();
        this.y = obj.getY();
    }
    public void moviemnto(){
    this.x = 1.0;
    this.y = 2.5;
    }
    public void movimento(double x, double y){
        this.x += x;
        this.y += y; 
    }
    public boolean equals (Ponto2D obj){
     
      return (this.x == obj.getX() && this.y == obj.getY()); 
    
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
