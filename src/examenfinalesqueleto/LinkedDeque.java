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
public class LinkedDeque<T> implements DequeADT<T> {

	public LinkedDeque() {
		this.inicio = null;
		this.fin=this.inicio;
	}
	
	private LinearNode<T> inicio;
	private LinearNode<T> fin;

	@Override
	public void enqueueFront(T dato) {
		LinearNode<T> newNode = new LinearNode<T>(dato);
		
		if(dato!=null){
			if(this.inicio != null){
				newNode.setSig(inicio);
				this.inicio = newNode;
			}else{
				this.inicio=newNode;
				this.fin=this.inicio;
			}
		}
	}

	@Override
	public void enqueueRear(T dato) {
		LinearNode<T> newNode = new LinearNode<T>(dato);
		
		if(dato!=null){
			if(this.fin!=null){
				this.fin.setSig(newNode);
				this.fin = newNode;
			}else{
				this.enqueueFront(dato);
			}
		}
	}

	@Override
	public T dequeueFront() {
		
		if(!this.isEmpty()){
			T ret = inicio.getDato();

			this.inicio = this.inicio.getSig();

			return ret;
		}else{
			return null;
		}
	}

	@Override
	public T dequeueRear() {
		if (!this.isEmpty()){
			LinearNode<T> previous = this.inicio;
			LinearNode<T> current = this.inicio.getSig();

			while(current.getSig()!= null){
				previous = current;
				current=current.getSig();
			}

			this.fin = previous;

			this.fin.setSig(null);

			return current.getDato();
		} else{
			return null;
		}
	}

	@Override
	public T first() {
		if (!this.isEmpty())
			return inicio.getDato();
		return null;
	}

	@Override
	public T last() {
		if(!this.isEmpty())
			return fin.getDato();
		return null;
	}

	@Override
	public boolean isEmpty() {
		return inicio==null;
	}
    

}
