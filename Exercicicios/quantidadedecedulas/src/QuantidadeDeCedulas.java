import java.util.Scanner;

public class QuantidadeDeCedulas {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valorDoSaque = scanner.nextInt();

        if (valorDoSaque < 2 || valorDoSaque > 1000) {
            System.out.println("opçao invalida");
            return;
        }

        int nota = 100;

        for (int i = 0; i < 6; i++) {
            int quantidadeDeCedulas = valorDoSaque / nota;
            if (quantidadeDeCedulas > 0) {
                System.out.println(quantidadeDeCedulas + " notas de R$" + nota);
                valorDoSaque = valorDoSaque % nota;
            }

            switch (nota) {
                case 100:
                    nota = 50;
                    break;
                case 50:
                    nota = 20;
                    break;
                case 20:
                    nota = 10;
                    break;
                case 10:
                    nota = 5;
                    break;
                case 5:
                    nota = 2;
                    break;
                default:
                    break;
            }
        }
    }
}
