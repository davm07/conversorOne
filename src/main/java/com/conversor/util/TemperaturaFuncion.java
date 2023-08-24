/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.util;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author diego
 */
public class TemperaturaFuncion {
    private double temperaturaFinal;
    
    public double convertirTemperatura(String valorDe, String valorPara, String valor){
        double valorNum = Double.parseDouble(valor);
        if(valorDe.equals(valorPara)){
            temperaturaFinal = valorNum;
        } else if (valorDe.equals("Celsius") && valorPara.equals("Fahrenheit")){
            temperaturaFinal  = (valorNum * 9/5) + 32;
        } else if (valorDe.equals("Celsius") && valorPara.equals("Kelvin")){
            temperaturaFinal = valorNum + 273.15;
        } else if (valorDe.equals("Fahrenheit") && valorPara.equals("Celsius")){
            temperaturaFinal = (valorNum - 32) * 5/9;
        } else if (valorDe.equals("Fahrenheit") && valorPara.equals("Kelvin")){
            temperaturaFinal = (valorNum - 32) * 5/9 + 273.15;
        } else if (valorDe.equals("Kelvin") && valorPara.equals("Celsius")){
            temperaturaFinal = valorNum - 273.15;
        } else if (valorDe.equals("Kelvin") && valorPara.equals("Fahrenheit")){
            temperaturaFinal = (valorNum - 273.15) * 9/5 + 32;
        }
        return temperaturaFinal;
    } 
}

