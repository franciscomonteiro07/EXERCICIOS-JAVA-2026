import java.util.Scanner;
public class Exercicio1_5_MesiaNotasCondicaoBooleana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1 (0 a 20): ");
        double numero1 = scanner.nextDouble();
        System.out.print("Nota 2 (0 a 20): ");
        double numero2 = scanner.nextDouble();
        double media = (numero1 + numero2) / 2.0;
        boolean aprovado = media >= 10.0;
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Aprovado (>= 10): " + aprovado);
    }
}
