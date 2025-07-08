/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.InstitutionData;
import TDA.LDE;

/**
 *
 * @author user
 */
public class InstitutionManager_LDE {
    
    private static LDE<InstitutionData> institutions = new LDE<>();
    
    public static LDE<InstitutionData> personas(){
        return institutions;
    }
    
    public static void addUser(InstitutionData userData){
        institutions.agregarFinal(userData);
        System.out.println("Expediente registrado");
    }
    
    
}
