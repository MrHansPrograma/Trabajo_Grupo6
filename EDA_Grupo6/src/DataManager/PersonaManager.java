/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.PersonaData;
import TDA.LSE;

/**
 *
 * @author user
 */
public class PersonaManager {
    
    private static LSE<PersonaData> personas = new LSE<>();
    
    public static LSE<PersonaData> personas(){
        return personas;
    }
    
    public static void addUser(PersonaData userData){
        personas.addLast(userData);
        System.out.println("Expediente registrado");
    }
    
}
