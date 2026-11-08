import java.util.Scanner;
public class Exercicio6_DecomposicaoSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o número de segundos: ");
        int totalSegundos = scanner.nextInt();
        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;
        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;
        System.out.printf("%d s = %d h %d min %d s\n", totalSegundos, horas, minutos,
                segundos);
    }

}
