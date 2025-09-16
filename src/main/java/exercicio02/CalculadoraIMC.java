/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

public class CalculadoraIMC {
    private String nome;
    private double peso;
    private double altura;
    
    public CalculadoraIMC (String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return peso/(altura * altura);
    }
    
    public String calcularRisco(){
        double imc = calcularIMC();
        if(imc < 20){
            return "Abaixo do peso ideal";
        }
        else if(imc <= 25){
            return "Peso normal";
        }
        else if(imc <= 30){
            return "Excesso de peso";
        }
        else if(imc <= 35){
            return "Obesidade";
        }
        else{
            return "Obesidade morbida";
        }
    }
}

