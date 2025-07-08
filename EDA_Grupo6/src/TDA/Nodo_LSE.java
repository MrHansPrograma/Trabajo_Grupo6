/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author user
 */
public class Nodo_LSE <T> {
    
    private T value;
    private Nodo_LSE <T> next;

    public Nodo_LSE(T value){
        this.value = value;
    }

    public T value()
    {
        return value;
    }

    public Nodo_LSE<T> next()
    {
        return next;
    }

    public void SetNext(Nodo_LSE<T> node)
    {
        this.next = node;
    }
    
}
