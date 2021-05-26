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
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n,int e) {
        nombre=n;
        edad=e;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        
        sb.append("Nombre: "+nombre+" Edad: "+edad);
        
        return sb.toString();
    }
}
