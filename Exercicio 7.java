import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int maior = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}