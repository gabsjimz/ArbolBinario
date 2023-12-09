/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareaarbolbinario;

/**
 *
 * @author gabsjimz
 */
public class TareaArbolBinario {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>(10);
        tree.getRoot().setLeftChild(new BinaryTree<>(7));
        tree.getRoot().setRightChild(new BinaryTree<>(5));
        
        for(NodeBinaryTree n : tree.preOrder()){
            System.out.println(n.getContent());
        }
    }
}
