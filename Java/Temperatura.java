// Crie um programa que solicite a entrada de uma temperatura em Celsius e apresente a conversão para outras unidades.


import java.util.Scanner;

public class Temperatura {

    // Constantes de conversão
    private static final double FAHRENHEIT_FACTOR = 1.8;
    private static final double KELVIN_OFFSET = 273.15;
    private static final double REAUMUR_FACTOR = 0.8;
    private static final double RANKINE_OFFSET = 459.67;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = convertToFahrenheit(celsius);
            double kelvin = convertToKelvin(celsius);
            double reaumur = convertToReaumur(celsius);
            double rankine = convertToRankine(celsius);

            System.out.println(String.format("%.2f°C em Celsius equivale a %.2f°F em Fahrenheit; %.2fK em Kelvin; %.2f°Re em Reaumur; %.2f°Ra em Rankine.",
                    celsius, fahrenheit, kelvin, reaumur, rankine));
        }
    }

    private static double convertToFahrenheit(double celsius) {
        return celsius * FAHRENHEIT_FACTOR + 32;
    }

    private static double convertToKelvin(double celsius) {
        return celsius + KELVIN_OFFSET;
    }

    private static double convertToReaumur(double celsius) {
        return celsius * REAUMUR_FACTOR;
    }

    private static double convertToRankine(double celsius) {
        return celsius * FAHRENHEIT_FACTOR + 32 + RANKINE_OFFSET;
    }
}