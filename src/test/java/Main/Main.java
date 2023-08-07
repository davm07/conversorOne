/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import com.conversor.conversorone.MainMenu;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.EventQueue;

/**
 *
 * @author diego
 */
public class Main {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                FlatDarkLaf.setup();
                MainMenu frame = new MainMenu();
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }
    
}
