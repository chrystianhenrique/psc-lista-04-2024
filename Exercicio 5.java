import java.util.Scanner;

public class Habitacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int populacaoA, populacaoB;
            do {
                System.out.print("Informe a população inicial do país A: ");
                populacaoA = scanner.nextInt();
                System.out.print("Informe a população inicial do país B: ");
                populacaoB = scanner.nextInt();

                if (populacaoA <= 0 || populacaoB <= 0) {
                    System.out.println("As populações devem ser números positivos. Tente novamente.");
                }
            } while (populacaoA <= 0 || populacaoB <= 0);

            double taxaCrescimentoA, taxaCrescimentoB;
            do {
                System.out.print("Informe a taxa de crescimento anual do país A (em decimal, por exemplo, 0.03 para 3%): ");
                taxaCrescimentoA = scanner.nextDouble();
                System.out.print("Informe a taxa de crescimento anual do país B (em decimal, por exemplo, 0.015 para 1.5%): ");
                taxaCrescimentoB = scanner.nextDouble();

                if (taxaCrescimentoA <= 0 || taxaCrescimentoB <= 0) {
                    System.out.println("As taxas de crescimento devem ser números positivos. Tente novamente.");
                }
            } while (taxaCrescimentoA <= 0 || taxaCrescimentoB <= 0);

            int anos = 0;
            while (populacaoA <= populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            System.out.println("Número de anos necessários para a população de A ultrapassar ou igualar a população de B: " + anos);

            System.out.print("Deseja repetir a operação? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        scanner.close();
    }
}