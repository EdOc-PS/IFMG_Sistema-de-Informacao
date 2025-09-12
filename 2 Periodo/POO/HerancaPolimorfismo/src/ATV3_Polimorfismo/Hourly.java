/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV3_Polimorfismo;

/**
 *
 * @author 0057138
 */
public class Hourly extends Employee{
    double hourlyRate, hours;
    
    public Hourly(String name, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
    }
     public double getPay(){ 
        return 0; 
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
     public void insertData(){
        
    }
    
    
}
