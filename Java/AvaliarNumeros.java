/* 
 * Crie um programa que realize a verificação dos números inseridos pelo usuário
 * Indique se o númemro é positivo ou negativo
 * Indique se o número é ímpar ou par
 * Indique se o número é primo
 */

 import java.util.Scanner;

 public class AvaliarNumeros {
     public static void main(String[] args) {
         // Declaração das variáveis
         int numero;
         String sinal;
         String par;
         String primo;
 
         System.out.print("Digite um número: ");
         Scanner scanner = new Scanner(System.in);
             numero = scanner.nextInt();
             scanner.close();
 
         // Avaliação do sinal
         sinal = avaliarSinal(numero);
 
         // Avaliação de paridade
         par = avaliarParidade(numero);
 
         // Avaliação de número primo
         primo = avaliarPrimo(numero);
 
         // Impressão dos resultados
         System.out.println(String.format("O número digitado foi %d", numero));
         System.out.println(String.format("O número digitado %s", sinal));
         System.out.println(String.format("O número digitado %s", par));
         System.out.println(String.format("O número digitado %s", primo));
     }
 
     private static String avaliarSinal(int numero) {
         if (numero >= 0) {
             return "é positivo";
         } else {
             return "é negativo";
         }
     }
 
     private static String avaliarParidade(int numero) {
         if (numero % 2 == 0) {
             return "é par";
         } else {
             return "é ímpar";
         }
     }
 
     private static String avaliarPrimo(int numero) {
         if (numero <= 1) {
             return "não é primo";
         }
         for (int i = 2; i <= Math.sqrt(numero); i++) {
             if (numero % i == 0) {
                 return "não é primo";
             }
         }
         return "é primo";
     }
 }