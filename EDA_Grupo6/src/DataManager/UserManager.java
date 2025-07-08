/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManager;

import DataClasses.UserData;
import TDA.LSE;

/**
 *
 * @author user
 */
public class UserManager {
    
    private static LSE<UserData> users = new LSE<>();
    
    public static void initialize(){
        
        UserData user = new UserData("admin", "12345");
        users.addLast(user);
        
        System.out.println("Datos del usuario cargados");
        
    }
    
    public static LSE<UserData> users(){
        return users;
    }
    
}
