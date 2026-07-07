import java.util.Scanner;

public class LoginComSenha {
    static void main(String[] args) {
        String senhaVerdadeira = "admin";
        int tentativas = 0;




        while (tentativas < 3) {
            Scanner scanner = new Scanner(System.in);
            String senha = scanner.nextLine();
            if (senha.equals(senhaVerdadeira)) {
                System.out.println("Senha Valida");
                break;
            } else {
                System.out.println("Senha invalida");
                System.out.println("Qual a senha? ");

            }
            tentativas++;

        }
    }
}
