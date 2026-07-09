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


        // percorre o vetor comparando e trocando elementos adjacentes: k - e - v - n | e->v->n->k
        for (int i = 0; i < clientes.length; i++) {
            if (i > 0) {
                // salvando nome da posição anterior (0) na variavel aux
                String aux = clientes[i - 1];
                // trocando nome da posição atual para a posição ANTERIOR
                clientes[i - 1] = clientes[i];
                // trocando nome da variavel aux para a posição atual
                clientes[i] = aux;
            }
        }
        // interando e concatenando por cada valor
        for (int i = 0; i < tamanho; i++) {
            // Para colocar no index 0
            clientes[i] = clientes[i].concat(" ++++++ ");

            // colocando primeira letra no final
            char primeiraPos = clientes[i].charAt(0);
            // Por ser um char precisou converter para String
            clientes[i] = clientes[i].concat(String.valueOf(primeiraPos));
        }

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("cliente: "+ clientes[i]);
        }
    }
}
