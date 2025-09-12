
package Retangulo;

/**
 *
 * @author 0057138
 */
public class Retangulo {
    private int altura = 1;
    private int largura = 1;
    private int area;
    private int perimetro;
    
    public void area(){
        setArea(getAltura() * getLargura());
    }
    public void perimetro(){
        setPerimetro((2 * getLargura()) + (2 * getAltura()));
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    
}
