/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

/**
 *
 * @author camar
 */
public class ConversorTemperatura {
    
    public static double celsiusParaFahrenheit (double celsius){
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public static double fahrenheitParaCelsius (double fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
