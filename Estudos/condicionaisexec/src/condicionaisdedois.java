import java.util.Scanner;

public class condicionaisdedois {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva o primeiro numero:");
            int num01 = scanner.nextInt();
            System.out.println("Escreva o segundo numero:");
            int num02 = scanner.nextInt();

            if (num01 > num02) {
                System.out.println(num01 + " maior que " + num02);
                System.out.println("o maior numero é: " + num01);
            } else if (num01 == num02) {
                System.out.println(num01 + " é igual a " + num02);
            } else {
                System.out.println(num01 + " é menor que " + num02);
                System.out.println("o maior numero é: " + num02);

            }
        }
}
