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
class NodeTree<E> {
    private E content;
    private LinkedList<Tree<E>> children;
    
    public NodeTree(E content){
        this.content = content;
        this.children = new LinkedList<>(); //lista inicializada. No es null.
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public LinkedList<Tree<E>> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<Tree<E>> children) {
        this.children = children;
    }   
}
