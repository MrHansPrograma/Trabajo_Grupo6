package TDA;

//Estructura del Nodo para la Lista Doblemente enlazada

public class Nodo_LDE<T> {
    private T value;
    private Nodo_LDE<T> prev;
    private Nodo_LDE<T> next;
    
    public Nodo_LDE(T value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public T value()
    {
        return value;
    }
    
    public Nodo_LDE<T> next()
    {
        return next;
    }

    public Nodo_LDE<T> prev()
    {
        return prev;
    }
    
    public void SetNext(Nodo_LDE<T> node)
    {
        this.next = node;
    }

    public void SetPrev(Nodo_LDE<T> node)
    {
        this.prev = node;
    }
}
