/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de IMC (Índice de Massa Corporal) ---");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        double peso = lerDouble(scanner, "Digite seu peso (em kg, ex: 70.5):");
        double altura = lerDouble(scanner, "Digite sua altura (em metros, ex: 1.75):");


        CalculadoraIMC calculadora = new CalculadoraIMC(nome, peso, altura);

        double imc = calculadora.calcularIMC();
        String risco = calculadora.calcularRisco();

        System.out.println("\n--- Relatório ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Seu IMC é: %.2f%n", imc); 
        System.out.printf("Classificação de Risco: %s%n", risco);

        scanner.close();
    }
    
    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem + " ");
            try {
                double valor = scanner.nextDouble();
                scanner.nextLine(); 
                if (valor > 0) {
                    return valor; 
                } else {
                    System.out.println("ERRO: O valor deve ser positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); 
            }
        }
    }
}
