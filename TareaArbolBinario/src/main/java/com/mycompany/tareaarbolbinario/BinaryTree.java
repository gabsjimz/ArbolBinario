/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaarbolbinario;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gabsjimz
 */
public class BinaryTree<E> {
    private NodeBinaryTree<E> root;
    
    public BinaryTree(){
        this.root = null;
    }
    
    public BinaryTree(E content){
        this.root = new NodeBinaryTree<>(content);
    }
    
    public NodeBinaryTree<E> getRoot() {
        return root;
    }

    public void setRoot(NodeBinaryTree<E> root) {
        this.root = root;
    }
    
    //Decidimos que cuando se crea el árbol y no se provee ningún tipo de información, la raíz es null. 
    //Conociendo el valor de la raíz sabemos si esta vacío.
    public boolean isEmpty(){
        return this.root == null;
    }
    
    public boolean isLeaf(){
        if(!isEmpty()) 
            return this.root.getLeftChild() == null && this.root.getRightChild() == null;       
        else return false;
    }
    
    public List<NodeBinaryTree<E>> preOrder(){
        List<NodeBinaryTree<E>> ordered = new LinkedList<>();
        if(this.isEmpty()) return ordered;
        
        ordered.add(this.root);

               
        if(this.root.getLeftChild() != null) {
            ordered.addAll(this.root.getLeftChild().preOrder());
        }
        if(this.root.getRightChild() != null) {
            ordered.addAll(this.root.getRightChild().preOrder());
        }
        return ordered;
    }
}
