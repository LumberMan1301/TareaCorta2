package Pila;

public class Pila<T>
{
    private NodeLista<T> tail;
    private NodeLista<T> head;
    private int capacidad;

    public Pila()
    {
        this.tail = null;
        this.head = null;
        this.capacidad = 0;
    }

    public void Push(T dato){
        PushP(dato);

    }
    private void PushP(T dato){
        NodeLista<T> nodo = new NodeLista(dato);
        if (this.capacidad == 0)
        {
            this.head = nodo;
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


    public void Peek(){
        PeekP();
    }
    private T PeekP(){
        System.out.println("El elemento solicitado es: "+this.tail.getData());
        return (T)this.tail.getData();
    }

    public void Pop(){
        PopP();
    }
    private void PopP(){
        if (this.capacidad == 1)
        {
            this.tail = null;
            this.head = null;
            this.capacidad -= 1;
        }
        else
        {
            System.out.println("El elemento retirado es: " + this.tail.getData());
            this.capacidad -= 1;
            NodeLista<T> a = this.tail.getPrev();
            this.tail = this.tail.getPrev();

        }

    }

    public int size()
    {
        return this.capacidad;
    }

    public void print(){
        printP();
    }
    private  void printP(){

        NodeLista<T> aux = this.head;
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
}
