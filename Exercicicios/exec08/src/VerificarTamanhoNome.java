import java.util.Scanner;

public class VerificarTamanhoNome {

    static int numero;

    public static void main(String[] args) {
        numeroDecrescente();
        numeroCrescente();
        repetirNome();
    }

    public static void numeroCrescente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----CRESCENTE----");
        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();
        for (int a = 0; a <= numero; a++) {
            System.out.println("numero: " + a);
        }
        System.out.println("\n---------------\n");
    }

    public static void numeroDecrescente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----DECRESCENTE----");
        System.out.println("Digite o numero: ");
        numero = scanner.nextInt();
        for (int a = numero; a >= 0; a--) {
            System.out.println("numero: " + numero);
            numero --;
        }
        System.out.println("\n---------------\n");
    }

    public static void repetirNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        if (nome.length() > 6 ) {
            System.out.println("Digite quantas vezes quer repetir o nome:");
            numero = scanner.nextInt();
            for (int a = 1; a <= numero; a++) {
                System.out.println(a + " - " + nome);
            }
        } else {
            System.out.println("nome não é maior que 6");
            System.out.println("Nome: " + nome);
        }

    }

}
