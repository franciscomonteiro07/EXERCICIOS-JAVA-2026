import java.util.Scanner;
public class Exercicio7_MaiorTresNumeroSem_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira três numeros inteiros separados de espaco: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int maior = Math.max(a, Math.max(b, c));
        System.out.println("Maior valor: " + maior);
    }

}
