/*
 * Crie um programa que solicite os dados de nome, idade, altura e peso.
 * Permita a inclusão de mais de um registo.
 * Retorne os registros
 */

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;
 
 class Registro {
     private String nome;
     private int idade;
     private double altura;
     private double peso;
 
     public Registro(String nome, int idade, double altura, double peso) {
         this.nome = nome;
         this.idade = idade;
         this.altura = altura;
         this.peso = peso;
     }
 
     @Override
     public String toString() {
         return String.format("Nome: %s, Idade: %d, Altura: %.2f, Peso: %.2f", nome, idade, altura, peso);
     }
 }
 
 public class Cadastro {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         List<Registro> registros = new ArrayList<>();
 
         boolean continuar = true;
         while (continuar) {
             System.out.print("Digite o nome: ");
             String nome = scanner.nextLine();
 
             System.out.print("Digite a idade: ");
             int idade = Integer.parseInt(scanner.nextLine());
 
             System.out.print("Digite a altura (em metros): ");
             double altura = Double.parseDouble(scanner.nextLine());
 
             System.out.print("Digite o peso (em kg): ");
             double peso = Double.parseDouble(scanner.nextLine());
 
             registros.add(new Registro(nome, idade, altura, peso));
 
             System.out.print("Deseja adicionar outro registro? (s/n): ");
             String resposta = scanner.nextLine();
             if (!resposta.equalsIgnoreCase("s")) {
                 continuar = false;
             }
         }
 
         System.out.println("\nRegistros adicionados:");
         for (Registro registro : registros) {
             System.out.println(registro);
         }
 
         scanner.close();
     }
 }