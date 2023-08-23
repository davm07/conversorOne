/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.util;

/**
 *
 * @author diego
 */
public class Verificador {
    private boolean isDigits;
    
    public boolean verificarCampo(String value){
        try {
            Double number = Double.valueOf(value);
            isDigits = true;
            
        } catch(Exception e){
            isDigits = false;
        }
        
        return isDigits;
    }
}
