/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ATV2;

/**
 *
 * @author eeuar
 */
public class Main {
        public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.inserir(1);
        bst.inserir(2);
        bst.inserir(3);
        bst.inserir(4);
        bst.inserir(5);
        
        bst.acessar(2);
        bst.acessar(2);
        bst.acessar(1);
        bst.acessar(5);
        bst.acessar(5);
        bst.acessar(5);

        System.out.println("arvore original:");
        bst.inorder();
   
        bst.rebuildTree();

        System.out.println("logo apos: ");
        bst.inorder();
        
    } 
}
