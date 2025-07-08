/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import DataClasses.EmployeeData;
import DataClasses.InstitutionData;
import DataClasses.PersonaData;


public class LSE<T>{
    
    Nodo_LSE<T> L;
    
    public LSE(){
        this.L = null;
    }

    public void addFirst(T value)
    {
        Nodo_LSE<T> newNode = new Nodo_LSE(value);
        
        if (L ==null)
        {
            newNode.SetNext(null);
        }
        else{
            newNode.SetNext(L);
        }
        
        L=newNode;
    }
    
    public void addLast(T value){

	Nodo_LSE<T> newNode = new Nodo_LSE(value); 

	if(L == null){
            addFirst(value);
	}else{
 
            Nodo_LSE ptr = L;
 
            while(ptr.next() != null){
                    ptr = ptr.next();
            }  
            ptr.SetNext(newNode);        

            newNode.SetNext(null);
	}
        }

    public void addBefore(T item, T ref){
        
	Nodo_LSE<T> newNode = new Nodo_LSE(item);  
        
        if (L!=null)
        {
            Nodo_LSE<T> ptr = L;
            Nodo_LSE<T> prev = null;
            
            while(ptr != null && !ptr.value().equals(ref)){
                    prev = ptr; 
                    ptr = ptr.next();
            } 

            if(ptr != null){
                    if(prev == null){
                            addFirst(item); 
                    }else{
                            
                            prev.SetNext(newNode);
                            
                            newNode.SetNext(ptr);        
                    }        
            }
            else
            {
                System.out.println("No se encontro el valor de referencia");
            }
        }
        else
        {
            System.out.println("Lista vacia, no existe valor de referencia");
        }
    }
    
    public void removeFirst(){
        
	if(L != null){
		L = L.next();
	}
    }
    public void removeLast(){
        
	Nodo_LSE<T> ptr = L;
	Nodo_LSE<T> prev = null;
        
	if(ptr != null){
            
		while(ptr.next() != null){
                    
			prev = ptr;
			ptr = ptr.next();
		}
		if(prev == null){
                    
			removeFirst();
                        
		}else{
			
			prev.SetNext(null);
		}
	}
    }

    
    public void remove(T ref){
        
	if(L != null){
            
		if(L.value().equals(ref)){
                    
			removeFirst();
                        
		}else{
                    
			Nodo_LSE<T> ptr = L.next();
			Nodo_LSE<T> prev = L;
                        
			while(ptr != null && ptr.value() != ref){
                            
				prev = ptr;
				ptr = ptr.next();
			}
			if(ptr != null){
                            
				prev.SetNext(ptr.next());                   
			}
		}
	}
    }

    public void showElements(){
	
	Nodo_LSE<T> ptr = L;
	
	while(ptr != null){
		
		System.out.print(ptr.value() + " --> ");
		ptr = ptr.next();
	}
	
	System.out.println("null");
    }
    
    public int countElements()
    {
    
        int elementCount=0;
        Nodo_LSE<T> ptr=L;
        
        while(ptr!=null){
            
            elementCount++;
            ptr=ptr.next();
            
        }
        
        return elementCount;
        
    }
    
    public Nodo_LSE<T> L(){
        return L;
    }
    
    public static Object Find_ID_EXP(LSE<Object> lista, int id){
        
        //Crea un ptr para la lista Principal - Le asigna el primer elemento (L)
        Nodo_LSE<Object> ptrPrincipal = lista.L();
        
        while(ptrPrincipal != null){
            
            //Asigna la sublista presente en el ptrPrincipal a una variable
            Object subLista = ptrPrincipal.value();
            //Para esta sublista de ser Object(Cualquier clase) a LSE<Object>(Lista de cualquier clase)
            LSE<Object> listaInterna = (LSE<Object>)subLista;
            
            //Crea un ptr de la sublista
            Nodo_LSE<Object> ptrSecundario = listaInterna.L();
            
            while(ptrSecundario != null){
                
                //Extrae la entidad de la sublista(puede ser cualquier clase, por lo que se compara dps)
                Object entidad = ptrSecundario.value();

                // Verifica si es EmployeeData
                if (entidad instanceof EmployeeData) {
                    EmployeeData emp = (EmployeeData) entidad;
                    if (emp.getID_expedient() != null && emp.getID_expedient() == id) {
                        return emp;
                    }
                }

                // Verifica si es InstitutionData
                if (entidad instanceof InstitutionData) {
                    InstitutionData inst = (InstitutionData) entidad;
                    if (inst.getID_expedient() != null && inst.getID_expedient() == id) {
                        return inst;
                    }
                }

                ptrSecundario = ptrSecundario.next();
            }
            ptrPrincipal = ptrPrincipal.next();
        }

        return null; // No se encontró ninguna entidad con ese ID
    }

}
