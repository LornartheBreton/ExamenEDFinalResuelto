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
public class MainPregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona susana=new Persona("Susana",17);
        Persona espergencia=new Persona("Espergencia",65);
        Persona apolinar=new Persona("Apolinar",34);

        // Pruebas con bicola 0:
        LinkedDeque<Persona> deque0=null;
        
        // No debe imprimirse nada, ya que no existe la bicola, o un
        // mensaje avisando de dicha situación:
        System.out.println(printDeque(deque0));
        
        // Pruebas con bicola 1:
        LinkedDeque<Persona> deque1=new LinkedDeque();
        
        // Se forman Susana, Espergencia y Apolinar, en ese orden:
        deque1.enqueueRear(susana);
        deque1.enqueueRear(espergencia);
        deque1.enqueueRear(apolinar);
        
        // Deben imprimirse Susana, Espergencia y Apolinar, en ese orden:
        System.out.println(printDeque(deque1));
        
        // Susana se da cuenta de que no tiene su pasaporte al tratar de hacer
        // el "check-in", se va a casa y al regresar se forma otra vez hasta
        // atrás:
        deque1.dequeueFront();
        // Deben imprimirse Espergencia y Apolinar, en ese orden:
        System.out.println(printDeque(deque1));
        deque1.enqueueRear(susana);
        
        // Espergencia es atendida y se va:
        deque1.dequeueFront();
        // Deben imprimirse Apolinar y Susana, en ese orden:
        System.out.println(printDeque(deque1));
        
        // Le dan prioridad al vuelo de Susana y entonces pasa al principio de
        // la cola:
        deque1.enqueueFront(deque1.dequeueRear());
        // Deben imprimirse Susana y Apolinar, en ese orden:
        System.out.println(printDeque(deque1));
        
        // Susana es atendida:
        deque1.dequeueFront();
        // Debe imprimirse Apolinar únicamente:
        System.out.println(printDeque(deque1));
        
        // Pruebas con bicola 2:
        LinkedDeque<Persona> deque2=new LinkedDeque();

        // Se forma Apolinar:
        deque2.enqueueFront(apolinar);
        // Debe imprimirse Apolinar únicamente:
        System.out.println(printDeque(deque2));
        // Se elimina Apolinar:
        deque2.dequeueRear();
        // Debe imprimirse una bicola vacía:
        System.out.println(printDeque(deque2));
        // Se forma Susana:
        deque2.enqueueRear(susana);
        // Debe imprimirse Susana únicamente:
        System.out.println(printDeque(deque2));
        
        // Pruebas con bicola 3:
        LinkedDeque<Persona> deque3=new LinkedDeque();

        // Se forma Apolinar:
        deque3.enqueueRear(apolinar);
        // Debe imprimirse Apolinar únicamente:
        System.out.println(printDeque(deque3));
        // Se elimina Apolinar:
        deque3.dequeueFront();
        // Debe imprimirse una bicola vacía:
        System.out.println(printDeque(deque3));
        // Se forma Susana:
        deque3.enqueueFront(susana);
        // Debe imprimirse Susana únicamente:
        System.out.println(printDeque(deque3));
        
        // Pruebas con bicola 4 (que se deja vacía):
        LinkedDeque<Persona> deque4=new LinkedDeque();
        // Este intento no debe funcionar, ya que la bicola está vacía:
        try {
            Persona dato=deque4.first();
        }
        // Se debe ejecutar el siguiente "catch":
        catch(EmptyDequeException e) {
            System.out.print("ERROR: intento de acceder a los datos ");
            System.out.println("de una bicola vacía.");
        }
        
        // Pruebas con bicola 5:
        LinkedDeque<Persona> deque5=new LinkedDeque();

        // Se forma Espergencia:
        deque5.enqueueRear(espergencia);
        // Debe imprimirse Espergencia únicamente:
        System.out.println(printDeque(deque5));
        // En cada uno de los dos siguientes accesos se debería imprimir
        // Espergencia únicamente:
        System.out.println(deque5.first());
        System.out.println(deque5.last());
    }
    public static <T> String printDeque(LinkedDeque<T> deque){
	   if(deque!=null){
	   StringBuilder build = new StringBuilder();
	   LinkedDeque<T> deque2 = deque;

	   if(deque2.isEmpty()){
		   return build.toString();
	   }

	   build.append(deque2.dequeueFront());
	   build.append(printDeque(deque2));

	   return build.toString();
	   } 

	   return null;
    }

}
