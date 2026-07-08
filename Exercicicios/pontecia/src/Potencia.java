import java.util.Scanner;

public class Potencia {
    static void main(String[] args) {
        int base, expoente, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a base: ");
        base = scanner.nextInt();
        System.out.println("Escreva o expoente: ");
        expoente = scanner.nextInt();
        resultado = base * 1;

        while (expoente > 1) {
            resultado = resultado * base;
            expoente--;

        }

        System.out.println("resultado: " + resultado);






    }
}
