import java.util.Scanner;

public class MenuOpcoes {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;
        do {
            System.out.println("Opcão 1: Continuar.");
            System.out.println("Opção 2: Sair.");
            opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Escreva algo");
                    String frase = scanner.nextLine();
                    System.out.println(frase);
                    break;
                case 2:
                    System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                    break;
                default:
                    break;
            }
        } while (opcaoEscolhida != 2);

    }
}