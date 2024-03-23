import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        String sexo;
        do {
            System.out.print("Digite o sexo (f - feminino, m - masculino): ");
            sexo = scanner.next();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        String estadoCivil;
        do {
            System.out.print("Digite o estado civil (s - solteiro, c - casado, v - viúvo, d - divorciado): ");
            estadoCivil = scanner.next();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        System.out.println("\nInformações válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}