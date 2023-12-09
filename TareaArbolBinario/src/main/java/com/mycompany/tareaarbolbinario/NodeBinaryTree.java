/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareaarbolbinario;

/**
 *
 * @author gabsjimz
 */
class NodeBinaryTree<E> {
    private E content;
    private BinaryTree<E> leftChild; //puntero al izquierdo
    private BinaryTree<E> rightChild; //puntero al derecho
    
    //este constructor instancia el árbol como hoja. 
    public NodeBinaryTree(E content){
        this.content = content;
        this.leftChild = null;
        this.rightChild = null;
    }   

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public BinaryTree<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTree<E> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTree<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTree<E> rightChild) {
        this.rightChild = rightChild;
    }
    
    
}
