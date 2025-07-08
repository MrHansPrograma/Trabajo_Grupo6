/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.EmployeeData;
import TDA.LSE;

/**
 *
 * @author user
 */
public class EmployeeManager {
    
    private static LSE<EmployeeData> employees = new LSE<>();
    
    public static LSE<EmployeeData> personas(){
        return employees;
    }
    
    public static void addUser(EmployeeData userData){
        employees.addLast(userData);
        System.out.println("Expediente registrado");
    }
    
}
