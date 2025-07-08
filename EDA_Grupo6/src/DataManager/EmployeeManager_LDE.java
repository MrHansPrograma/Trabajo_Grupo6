/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.EmployeeData;
import TDA.LDE;

/**
 *
 * @author user
 */
public class EmployeeManager_LDE {
    
    private static LDE<EmployeeData> employees = new LDE<>();
    
    public static LDE<EmployeeData> personas(){
        return employees;
    }
    
    public static void addUser(EmployeeData userData){
        employees.agregarFinal(userData);
        System.out.println("Expediente registrado");
    }
    
}
