import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int vetorInt[] = new int[]{1,2,3,4};

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int vetor[] = new int[num];

        System.out.println(vetor.length);
        System.out.println(vetorInt[0]);

        for (int i = 0; i < vetorInt.length; i++) {
            System.out.println(vetorInt[i]);
        }

        // Buble sort
        System.out.println("--------------------");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        // String clientes[] = new String[];
//        List<String> clientes = new ArrayList<>();

        String[] clientes = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("digite o valor da posição " + i + " do vetor");
//            String nomes = scanner.nextLine();
//            clientes.add(nomes);
            clientes[i] = scanner.nextLine();
        }

//        for (int i = 0; i < clientes.size(); i++) {
//            System.out.println("cliente: "+ clientes.get(i));
//        }

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("cliente: "+ clientes[i]);
        }
    }
}
