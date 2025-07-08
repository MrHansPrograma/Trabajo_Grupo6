/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.PersonaData;
import TDA.LDE;
import TDA.LSE;

/**
 *
 * @author user
 */
public class PersonaManager_LDE {
    
    private static LDE<PersonaData> personas = new LDE<>();
    
    public static LDE<PersonaData> personas(){
        return personas;
    }
    
    public static void addUser(PersonaData userData){
        personas.agregarFinal(userData);
        System.out.println("Expediente registrado");
    }
    
}
