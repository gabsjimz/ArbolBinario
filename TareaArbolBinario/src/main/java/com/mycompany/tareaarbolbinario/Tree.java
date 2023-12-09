/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaarbolbinario;

/**
 *
 * @author gabsjimz
 */
public class Tree<E> {
    private NodeTree<E> root;
    
    public Tree(){
        this.root = null;
    }
    
    public Tree(NodeTree<E> root){
        this.root = root;
    }
}
