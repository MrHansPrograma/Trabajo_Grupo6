/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

public class LDE<T> {
    private Nodo_LDE<T> head;
    private Nodo_LDE<T> tail;

    public LDE() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void agregarInicio(T value) {
        Nodo_LDE<T> newNode = new Nodo_LDE<>(value);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.SetNext(head);
            head.SetPrev(newNode);
            head = newNode;
        }
        System.out.println("exito");
    }
    
    public void agregarFinal(T value){
        Nodo_LDE<T> newNode = new Nodo_LDE<>(value);
        
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            Nodo_LDE<T> ptr = head;
            while(ptr.next() != null){
                ptr= ptr.next();
                }
            ptr.SetNext(newNode);
            newNode.SetPrev(ptr);
        }
       
    }
    
    public Nodo_LDE<T> head(){
        return head;
    }
}
