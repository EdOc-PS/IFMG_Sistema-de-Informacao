/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV1;

/**
 *
 * @author eeuar
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree arvore = new BinarySearchTree();

        arvore.inserir("arquivo1", 20230101);
        arvore.inserir("arquivo2", 20220515); 
        arvore.inserir("arquivo3", 20230721); 
        arvore.inserir("arquivo4", 20201231);
 
        System.out.println("Arquivos antes da remocao:");
        arvore.inorder();

        int dataRemover = 20230101;
        arvore.removerVelho(dataRemover);

        System.out.println("Arquivos apos a remocao:");
        arvore.inorder();
    }
}