import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome do usúario: ");
            usuario = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("A senha não pode ser igual ao nome de usúario, por favor digite outra senha.");
            }

            } while (senha.equals(usuario));
            System.out.println("Nome de usúario e senha valídos");

            scanner.close();
        }
    }


