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
public interface DequeADT<T> {
    public void enqueueFront(T dato);
    public void enqueueRear(T dato);
    public T dequeueFront();
    public T dequeueRear();
    public T first();
    public T last();
    public boolean isEmpty();
    
}
