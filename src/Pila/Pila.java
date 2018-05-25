package Pila;

public class Pila<T>
{
    private NodeLista<T> tail;
    private int capacidad;

    public Pila()
    {
        this.tail = null;
        this.capacidad = 0;
    }

    
    public void push(T dato){
        NodeLista<T> nodo = new NodeLista(dato);
        if (this.capacidad == 0)
        {
            this.tail = nodo;
            this.capacidad += 1;
        }
        else
        {
            NodeLista<T> current = this.tail;
            nodo.setPrev(current);
            current.setNext(nodo);
            this.tail = nodo;
            this.tail.setNext(null);
            this.capacidad += 1;
        }
    }


    public T peek(){
        System.out.println("El elemento solicitado es: "+this.tail.getData());
        return (T)this.tail.getData();
    }

    
    public T pop(){
    	NodeLista<T> actual = this.tail;
        if (this.capacidad == 1)
        {
        	
            this.tail = null;
            this.capacidad -= 1;
            
        }
        else
        {
            System.out.println("El elemento retirado es: " + this.tail.getData());
            this.capacidad -= 1;
            NodeLista<T> a = this.tail.getPrev();
            this.tail = this.tail.getPrev();

        }
		return (T)actual;

    }

    public int size()
    {
        return this.capacidad;
    }

    public void print(){
        printP();
    }
    private  void printP(){


        NodeLista<T> aux = this.tail;
        if (aux == null)
        {
            System.out.println("La pila esta Vacia");
        }
        while (aux.getNext() != null) {
            if (aux.getNext() == null)
            {

                aux = aux.getNext();
            }
            else
            {
                System.out.println("["+aux.getData()+"]");
                aux = aux.getNext();
            }
        }

    }

    public boolean empty() {
		if (this.capacidad == 0)
			return true;
    	return false;
    	
    }
}
