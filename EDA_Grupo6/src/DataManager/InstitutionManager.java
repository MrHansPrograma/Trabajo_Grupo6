/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.InstitutionData;
import TDA.LSE;

/**
 *
 * @author user
 */
public class InstitutionManager {
    
    private static LSE<InstitutionData> institutions = new LSE<>();
    
    public static LSE<InstitutionData> personas(){
        return institutions;
    }
    
    public static void addUser(InstitutionData userData){
        institutions.addLast(userData);
        System.out.println("Expediente registrado");
    }
    
    
}
