public class Concursos {

    public static int calcular(int a, int b) {

        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
        return resultado; // Ensure the method returns an int as declared
    }

    public static void main(String[] args) {
        calcular(5, 4); // Call the method within the same class
    }
}