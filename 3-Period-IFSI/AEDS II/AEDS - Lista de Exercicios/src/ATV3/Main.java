/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ATV3;

import ATV2.*;

/**
 *
 * @author eeuar
 */
public class Main {

    public static void main(String[] args) {
        BinarySearchTree treeT = new BinarySearchTree();
        BinarySearchTree treeS = new BinarySearchTree();
                
        treeT.inserir(26);
        treeT.inserir(10);
        treeT.inserir(3);
        treeT.inserir(3);
        
        treeT.inserir(4);
        treeT.inserir(6);
        treeT.inserir(30);

        treeS.inserir(10);
        treeS.inserir(30);
        treeS.inserir(6);
        treeS.inserir(4);
        
        
        System.out.println("arvore original:");
        treeT.inorder(treeS.getRoot().chave);
       
        
     
    }
}
