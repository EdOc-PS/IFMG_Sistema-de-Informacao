/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV1;

/**
 *
 * @author eeuar
 */
public class BinaryTree {

    String nome;
    int data;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(String fileName, int lastAccessDate) {
        this.nome = fileName;
        this.data = lastAccessDate;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {

    BinaryTree root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void inserir(String nome, int data) {
        root = insertRec(root, nome, data);
    }

    private BinaryTree insertRec(BinaryTree root, String nome, int data) {
        if (root == null) {
            root = new BinaryTree(nome, data);
            return root;
        }

        if (nome.compareTo(root.nome) < 0) {
            root.left = insertRec(root.left, nome, data);
        } else if (nome.compareTo(root.nome) > 0) {
            root.right = insertRec(root.right, nome, data);
        }

        return root;
    }

    public void removerVelho(int dataRemover) {
        root = removeOldFilesRec(root, dataRemover);
    }

    private BinaryTree removeOldFilesRec(BinaryTree root, int dataRemover) {
        if (root == null) {
            return null;
        }

        root.left = removeOldFilesRec(root.left, dataRemover);
        root.right = removeOldFilesRec(root.right, dataRemover);

        if (root.data < dataRemover) {
            return excluir(root);
        }

        return root;
    }

    private BinaryTree excluir(BinaryTree root) {
        if (root.left == null && root.right == null) {
            return null;
        }

        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        BinaryTree successor = findMin(root.right);
        root.nome = successor.nome;
        root.data = successor.data;
        root.right = removeOldFilesRec(root.right, successor.data);

        return root;
    }

    private BinaryTree findMin(BinaryTree root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BinaryTree root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.nome + " - " + root.data + "\n");
            inorderRec(root.right);
        }

    }
}
