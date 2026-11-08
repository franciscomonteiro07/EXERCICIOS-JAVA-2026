import java.util.Scanner;

public class Exercicio8_CaculoPrecoSemIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Preço com IVA (23%): ");
        double precoComIva = scanner.nextDouble();
        double precoSemIva = precoComIva / 1.23;
        double valorImposto = precoComIva - precoSemIva;
        System.out.printf("Preço sem IVA: %.2f €\n", precoSemIva);
        System.out.printf("Valor do IVA: %.2f €\n", valorImposto);
    }
}
