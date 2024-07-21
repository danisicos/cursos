import java.util.Scanner;

public class temperatura {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em celsius: ");
            double c = scanner.nextDouble();
            
      
            double f = c * 18 + 32;
            double k = c + 273.15;
            double re = c*0.8;
            double ra = c*1.8+32+459.67;


            System.out.println(c + " em Celsius equivale a " + f + " em Farenheit; " + k + " em Kelvin; " + re + " em Reamur; " + ra + " em Rankine.");
        }

    }
}