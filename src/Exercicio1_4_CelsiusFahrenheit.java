import java.util.Scanner;

public class Exercicio1_4_CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
// Usei 9.0 para evitar a divisão inteira (9 / 5 = 1)
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.printf("%.1f ºC = %.1f ºF\n", celsius, fahrenheit);
    }

}
