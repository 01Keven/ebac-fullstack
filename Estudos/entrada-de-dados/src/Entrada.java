import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boas Vindas!");
        System.out.println("Nome Completo: ");
        String nome = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Estado Civil: ");
        String estadoCivil = scanner.nextLine();

        System.out.println("\n--- Dados Digitados ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}