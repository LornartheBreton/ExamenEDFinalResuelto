/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalesqueleto;
/**
 *
 * @author andre
 */
public class MainPregunta2 {
    
    public static void main(String a[]) {
        Persona bodicea=new Persona("Bodicea",17);
        Persona gertrudis=new Persona("Gertrudis",65);
        Persona meliton=new Persona("Melitón",34);
    
        // Pruebas #1:
        LinearNode<Persona> n0=null;
        // Debería imprimir 0 (porque ni siquiera existe el nodo "n0"):
        System.out.println("Hay "+cuentaEdadesImpares(n0)+" personas con edades impares.");

        // Pruebas #2:
        LinearNode<Persona> n1=new LinearNode(bodicea);
        LinearNode<Persona> n2=new LinearNode(gertrudis);
        LinearNode<Persona> n3=new LinearNode(meliton);
        LinearNode<Persona> n4=new LinearNode(bodicea);
        n1.setSig(n2);
        n2.setSig(n3);
        n3.setSig(n4);

        // Debería imprimir 3 (porque a partir del nodo "n1" hay tres nodos que
        // contienen personas cuyas edades son impares):
        System.out.println("Hay "+cuentaEdadesImpares(n1)+" personas con edades impares.");
        // Debería imprimir 2 (porque a partir del nodo "n2" hay dos nodos que
        // contienen personas cuyas edades son impares):
        System.out.println("Hay "+cuentaEdadesImpares(n2)+" personas con edades impares.");

        // Pruebas #3:
        LinearNode<Persona> n5=new LinearNode(null);
        // Debería imprimir 0 (porque no hay ningún dato dentro del nodo "n5"):
        System.out.println("Hay "+cuentaEdadesImpares(n5)+" personas con edades impares.");
    
        // Pruebas #4:
        LinearNode<Integer> n6=new LinearNode(new Integer(37));
        // Debería imprimir 0 (porque no hay personas entre los nodos enlazados
        // que hay a partir de "n6"):
        System.out.println("Hay "+cuentaEdadesImpares(n6)+" personas con edades impares.");

        // Pruebas #5:
        LinearNode<Integer> n7=new LinearNode(new Integer(8));
        LinearNode<Integer> n8=new LinearNode(new Integer(78));
        LinearNode<Integer> n9=new LinearNode(new Integer(7));
        LinearNode<Integer> n10=new LinearNode(new Integer(3));
        n7.setSig(n8);
        n8.setSig(n9);
        n9.setSig(n10);
        // Debería imprimir 0 (porque no hay personas entre los nodos enlazados
        // que hay a partir de "n7"):
        System.out.println("Hay "+cuentaEdadesImpares(n7)+" personas con edades impares.");
        System.out.println("");
        
        // Pruebas #6:
        LinearNode<Persona> n11=null;
        LinearNode<Persona> n12=new LinearNode(bodicea);
        // No debe insertar el nodo "n12" en ninguna parte porque no existe
        // el nodo "n11", que debería ser el nodo de inicio:
        insertaEnLaPos(4,n11,n12);
        // Debería imprimir 0 (porque ni siquiera existe el nodo "n11"):
        System.out.println("Hay "+cuentaEdadesImpares(n11)+" personas con edades impares.");
        // No debe insertar nada en ninguna parte porque no existe ningún
        // nodo (no se especificó ningún nodo) a insertar:
        insertaEnLaPos(4,n11,null);
        // Debería imprimir 0 (porque ni siquiera existe el nodo "n11"):
        System.out.println("Hay "+cuentaEdadesImpares(n11)+" personas con edades impares.");
        
        // Pruebas #7:
        LinearNode<Persona> n13=new LinearNode(meliton);
        LinearNode<Persona> n14=new LinearNode(meliton);
        LinearNode<Persona> n15=new LinearNode(meliton);
        LinearNode<Persona> n16=new LinearNode(meliton);
        n13.setSig(n14);
        n14.setSig(n15);
        // Debería quedar una secuencia de cuatro nodos enlazados a partir
        // de "n13", todos con "meliton" como dato:
        insertaEnLaPos(1,n13,n16);
        // Debería imprimir 0 (porque debe haber cuatro nodos enlazados
        // empezando por "n13", pero ninguno contiene objetos de tipo Persona
        // con edades impares):
        System.out.println("Hay "+cuentaEdadesImpares(n13)+" personas con edades impares.");    

        // Pruebas #8:
        LinearNode<Persona> n17=new LinearNode(bodicea);
        LinearNode<Persona> n18=new LinearNode(bodicea);
        LinearNode<Persona> n19=new LinearNode(meliton);
        LinearNode<Persona> n20=new LinearNode(meliton);
        n17.setSig(n18);
        n18.setSig(n19);
        // Debería quedar una secuencia de cuatro nodos enlazados a partir
        // de "n17", el primero y el tercero con "bodicea" como dato, y el
        // segundo y el cuarto con "meliton" como dato:
        insertaEnLaPos(1,n17,n20);
        // Debería imprimir 1 (porque debe haber dos nodos enlazados
        // empezando por "n18", pero sólo uno de ellos debe contener
        // objetos de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n18)+" personas con edades impares.");
        // Debería imprimir 2 (porque debe haber cuatro nodos enlazados
        // empezando por "n17", pero sólo dos de ellos deben contener
        // objetos de tipo Persona con edades impares):
        System.out.println("Hay "+cuentaEdadesImpares(n17)+" personas con edades impares.");         

        // Pruebas #9:
        LinearNode<Persona> n21=new LinearNode(bodicea);
        LinearNode<Persona> n22=new LinearNode(bodicea);
        LinearNode<Persona> n23=new LinearNode(meliton);
        LinearNode<Persona> n24=new LinearNode(bodicea);
        n21.setSig(n22);
        n22.setSig(n23);
        // Debería quedar una secuencia de cuatro nodos enlazados a partir
        // de "n21", tres de ellos con "bodicea" como dato, pero el otro (el
        // tercero/penúltimo) debe tener a "meliton" como dato:
        insertaEnLaPos(3,n21,n24);
        // Debería imprimir 3 (porque debe haber cuatro nodos enlazados
        // empezando por "n21", pero sólo tres de ellos deben contener
        // objetos de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n21)+" personas con edades impares.");
        // Debería imprimir 1 (porque debe haber dos nodos enlazados
        // empezando por "n23", pero sólo uno de ellos debe contener
        // objetos de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n23)+" personas con edades impares.");

        // Pruebas #10:
        LinearNode<Persona> n25=new LinearNode(bodicea);
        LinearNode<Persona> n26=new LinearNode(bodicea);
        LinearNode<Persona> n27=new LinearNode(meliton);
        LinearNode<Persona> n28=new LinearNode(bodicea);
        n25.setSig(n26);
        n26.setSig(n27);
        // Debería imprimir 2 (porque debe haber tres nodos enlazados
        // empezando por "n25", pero sólo dos de ellos deben contener
        // objetos de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n25)+" personas con edades impares.");        
        // Debería quedar una secuencia de cuatro nodos enlazados a partir
        // de "n25", tres de ellos con "bodicea" como dato, pero el otro (el
        // tercero/penúltimo) debe tener a "meliton" como dato:
        insertaEnLaPos(63,n25,n28);
        // Debería imprimir 3 (porque debe haber cuatro nodos enlazados
        // empezando por "n25", pero sólo tres de ellos deben contener
        // objetos de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n25)+" personas con edades impares.");        

        // Pruebas #11:
        LinearNode<Persona> n29=new LinearNode(bodicea);
        LinearNode<Persona> n30=new LinearNode(bodicea);
        // Debería imprimir 1 (porque sólo debe haber un nodo empezando
        // por "n29", no enlazado con nada, y debe contener un objeto
        // de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n29)+" personas con edades impares.");        
        // Debería quedar una secuencia de dos nodos enlazados a partir
        // de "n29", los dos con "bodicea" como dato:
        insertaEnLaPos(63,n29,n30);
        // Debería imprimir 2 (porque debe haber dos nodos enlazados
        // empezando por "n29", y los dos deben contener
        // objetos de tipo Persona con una edad impar):
        System.out.println("Hay "+cuentaEdadesImpares(n29)+" personas con edades impares."); 
    }
   
    public static <T> int cuentaEdadesImpares(LinearNode<T> node){
	    int ret=0;
	    
	    if(node!=null){	
		if(node.getDato() instanceof Persona){
			LinearNode<Persona> iterator = (LinearNode<Persona>) node;
			
			while(iterator!=null){
				if(iterator.getDato().getEdad()%2==1)
					ret++;
				iterator=iterator.getSig();
			}
		}
	    }
	    
	    return ret;
    }
    
    public static <T> void insertaEnLaPos(int pos, LinearNode<T> node, 
	    LinearNode<T> newNode){
	    
	    LinearNode<T> previous = node;
	    LinearNode<T>  current = previous.getSig();
	    
	    if(pos>=1){
		    for(int i=1;i<=pos;i++){
			    previous=current;
			    current=current.getSig();
		    }
		    
		    previous.setSig(newNode);
		    newNode.setSig(current);
	    }
    }

}
