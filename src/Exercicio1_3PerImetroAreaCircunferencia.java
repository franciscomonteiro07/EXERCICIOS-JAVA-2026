import java.util.Scanner;
public class Exercicio1_3PerImetroAreaCircunferencia {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o raio: ");
        double raio = scanner.nextDouble();
        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Perímetro: %.2f\n", perimetro);
        System.out.printf("Área: %.2f\n", area);
    }

}
