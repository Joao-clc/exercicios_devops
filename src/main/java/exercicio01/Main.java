/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Conversor de Temperatura Interativo ---");
            System.out.println("1 - Converter de Celsius para Fahrenheit");
            System.out.println("2 - Converter de Fahrenheit para Celsius");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    converterCelsiusParaFahrenheit(scanner);
                    break;
                case "2":
                    converterFahrenheitParaCelsius(scanner);
                    break;
                case "3":
                    System.out.println("Encerrando o programa. Até mais!");
                    scanner.close(); 
                    return; 
                default:
                    System.out.println("ERRO: Opção inválida! Por favor, escolha 1, 2 ou 3.");
            }
        }
    }

    private static void converterCelsiusParaFahrenheit(Scanner scanner) {
        System.out.print("Digite a temperatura em Celsius (°C): ");
        String entrada = scanner.nextLine();
        try {
            double celsius = Double.parseDouble(entrada);
            double fahrenheit = ConversorTemperatura.celsiusParaFahrenheit(celsius);
            System.out.printf("==> Resultado: %.1f°C é igual a %.1f°F%n", celsius, fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Valor inválido. Por favor, digite um número.");
        }
    }

    private static void converterFahrenheitParaCelsius(Scanner scanner) {
        System.out.print("Digite a temperatura em Fahrenheit (°F): ");
        String entrada = scanner.nextLine();
        try {
            double fahrenheit = Double.parseDouble(entrada);
            double celsius = ConversorTemperatura.fahrenheitParaCelsius(fahrenheit);
            System.out.printf("==> Resultado: %.1f°F é igual a %.1f°C%n", fahrenheit, celsius);
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Valor inválido. Por favor, digite um número.");
        }
    }
}
