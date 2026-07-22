import com.orientacaoobjeto.estacionamento.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPreco= 0;
//        Carro carro = new Carro();

        System.out.print("Quantidade de Carros: ");
        int quantidadeCarros = scanner.nextInt();

        if (quantidadeCarros > 50) {
            System.out.println("Não pode ser maior que 50");
            return;
        }
        scanner.nextLine();


        Carro[] carros = new Carro[quantidadeCarros];

        definirCarro(carros, scanner);
        somarPreco(carros);



    }

    private static void definirCarro(Carro[] carros, Scanner scanner) {
        for (int i = 0; i < carros.length; i++) {
            System.out.println("==================");
            System.out.println("Carro n-" + (i + 1));
            System.out.print("\nModelo do carro: ");
            String nome = scanner.nextLine();

            System.out.print("\nPreço do carro: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            carros[i] = new Carro(nome, preco);

        }
        exibirCarro(carros);
    }

    private static void somarPreco(Carro[] carros) {
        double totalPreco = 0.0;
        for (int i = 0; i < carros.length; i++) {
            totalPreco += carros[i].getPreco();
        }
        System.out.println("========================");
        System.out.println("Qauntidade de Carros: " + carros.length);
        System.out.println("Total valor de carros: R$" + totalPreco);
    }

    private static void exibirCarro(Carro[] carros) {
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }
    }



}
