/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.modelo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class Temperatura {
    
    private String[] temperaturas = {"Celsius", "Fahrenheit", "Kelvin"};
    
    public String getTemperaturas(){
        return Arrays.toString(this.temperaturas);
    }
    
    
}

