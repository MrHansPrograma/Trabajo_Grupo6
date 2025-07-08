/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Screens;

import TDA.Pila;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ScreenManager {
    
    private static Pila<JFrame> Pila = new Pila<>();
    
    public static void openNewScreen(JFrame currentScreen, JFrame newScreen) {
        currentScreen.setVisible(false);
        Pila.push(currentScreen);
        newScreen.setVisible(true);
    }
    
    public static void goBack(JFrame currentScreen) {
        currentScreen.dispose();
        Pila.pop().setVisible(true);
    }
}
