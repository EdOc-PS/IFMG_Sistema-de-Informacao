/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarbonFoot;

/**
 *
 * @author 0057138
 */
public class Car implements CarbonFootprint{
    private String nome;
    private String combustivel;
    private float cilindrada;

    public Car(String nome, String combustivel, float cilindrada) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public int getCarbonFootprint() {
          return 4;
      }
    }

    
    
    
   

   
    

