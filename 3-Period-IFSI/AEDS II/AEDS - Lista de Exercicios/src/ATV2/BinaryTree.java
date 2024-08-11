/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author eeuar
 */
public class BinaryTree {

    int chave;
    int Frequencia;
    BinaryTree left, right;

    public BinaryTree(int item) {
        chave = item;
        Frequencia = 0; 
        left = right = null;
    }
}

class BinarySearchTree {
    BinaryTree root;

    public BinarySearchTree() {
        root = null;
    }

    public BinaryTree acessar(int key) {
        return acessarRec(root, key);
    }

    private BinaryTree acessarRec(BinaryTree root, int key) {
        if (root == null || root.chave == key) {
            if (root != null) {
                root.Frequencia++;
            }
            return root;
        }

        if (key < root.chave) {
            return acessarRec(root.left, key);
        } else {
            return acessarRec(root.right, key);
        }
    }

    public void inserir(int key) {
        root = insertRec(root, key);
    }

    private BinaryTree insertRec(BinaryTree root, int key) {
        if (root == null) {
            root = new BinaryTree(key);
            return root;
        }

        if (key < root.chave) {
            root.left = insertRec(root.left, key);
        } else if (key > root.chave) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public List<BinaryTree> collectNodes() {
        List<BinaryTree> nodes = new ArrayList<>();
        collectNodesRec(root, nodes);
        return nodes;
    }

    private void collectNodesRec(BinaryTree root, List<BinaryTree> nodes) {
        if (root != null) {
            collectNodesRec(root.left, nodes);
            nodes.add(root);
            collectNodesRec(root.right, nodes);
        }
    }

    public void rebuildTree() {
        List<BinaryTree> nodes = collectNodes();
     
        Collections.sort(nodes, new Comparator<BinaryTree>() {
            @Override
            public int compare(BinaryTree o1, BinaryTree o2) {
                return Integer.compare(o2.Frequencia, o1.Frequencia);
            }
        });
      
        root = null;
        for (BinaryTree node : nodes) {
            root = insertRec(root, node.chave);
            root.Frequencia = node.Frequencia; // Mantém a frequência de acesso
        }
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BinaryTree root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.chave + " Frequencia: (" + root.Frequencia + ") ");
            inorderRec(root.right);
        }
    }
}
