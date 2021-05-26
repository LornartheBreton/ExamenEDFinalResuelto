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
public class EmptyDequeException extends RuntimeException {
    public EmptyDequeException() {
        super("No se puede realizar esa operación porque la bicola está vacía.");
    }
}
