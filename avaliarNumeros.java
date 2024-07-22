/* 
 * Crie um programa que realize a verificação dos números inseridos pelo usuário
 * Indique se o númemro é positivo ou negativo
 * Indique se o número é ímpar ou par
 * Indique se o número é primo
 */

import java.util.Scanner;

public class avaliarNumeros {
    public static void main(String[] args) {
        //bloco de declaração das variáveis
        
        int numero = 0;
        String sinal = "valor inválido";
        String par = "valor inválido";
        String primo = "valor inválido";

        System.out.println("Digite um número: ");
        try (Scanner scanner = new Scanner(System.in)) {
            numero = scanner.nextInt();
        }

        //bloco das condicionais

        if (numero>=0)
            sinal = "é positivo";
        else 
            sinal = "é negativo";

        if (numero%2==0)
            par = "é par";
        else
            par = "é ímpar";

        for (int i=2; i<=Math.sqrt(numero); i++){ //implementação simplificada
            if (numero%i==0)
                primo = "não é primo";
            else
                primo = "é primo";
        }

        //bloco da impressão dos resultados

        System.out.println("O número digitado foi " + numero);
        System.out.println("O número digitado " + sinal);
        System.out.println("O número digitado " + par);
        System.out.println("O número digitado " + primo);
    }
}