/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalesqueleto;

/**
 *
 * @author agomezdg
 */
public class LinearNode<T> {
    private T dato;
    private LinearNode<T> sig;
    
    public LinearNode() {
        dato=null;
        sig=null;
    }
    
    public LinearNode(T dato) {
        this.dato=dato;
        sig=null;
    }
    
    public T getDato() {
        return dato;
    }
    
    public LinearNode<T> getSig() {
        return sig;
    }
    
    public void setSig(LinearNode<T> nuevo) {
        sig=nuevo;
    }
    
    public String toString() {
        return dato.toString();
    }
}
