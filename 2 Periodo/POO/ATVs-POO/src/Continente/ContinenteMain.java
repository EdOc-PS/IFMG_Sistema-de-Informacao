package Continente;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 0057138
 */
public class ContinenteMain {

    static Scanner TEC = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Pais> vetP = new ArrayList<Pais>();
        int esc;
        Pais nv = new Pais();
        
        do{
        System.out.println("---- Sistema das Americas ---- \n1 - Cadastrar pais; \n2 - Sair");
        switch (esc) {
            case 1:
                nv = cadastrarPais();
                break;
        }
        }while(esc != 2);
    }

    public static Pais cadastrarPais() {
        Pais p = new Pais();
        System.out.println("Qual o nome do novo pais? ");
        String nome = TEC.next();
        System.out.println("Qual e a dimensao do "+nome);
        double area = TEC.nextDouble();
        System.out.println("Qual e a populacao do "+nome);
        int populacao = TEC.nextInt();
        
        p.setNomeP(nome);
        p.setAreaP(area);
        p.setPopulacaoP(populacao);
        
        return p;
    }
}
