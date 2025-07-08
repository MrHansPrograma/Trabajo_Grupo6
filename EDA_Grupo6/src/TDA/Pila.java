/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author user
 */
public class Pila<T> {
    
    private static final int MAX_SIZE = 100;
    private T[] data;
    private int top;
    
    public Pila(){
        data = (T[]) new Object[MAX_SIZE];
        top = -1;
    }
    
    public boolean isEmpty(){
	boolean ans = (top == -1);
	return ans;
    }
    
    public boolean isFull(){
	boolean ans = (top + 1 == MAX_SIZE);
	return ans;
    }
    
    public void push(T item){
	if(!isFull()){
            top++;
            data[top] = item;
	}
    }
    
    public T pop(){
        if (isEmpty()){
            System.out.println("Pila vacia");
            return null;
        }
        T item = data[top];
        top--;
        return item;
    }      
    
}
