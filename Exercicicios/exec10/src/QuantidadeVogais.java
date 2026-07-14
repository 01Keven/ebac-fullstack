import java.util.Scanner;

public class QuantidadeVogais {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho do vetor:");
        int tamanhoVetor = scanner.nextInt();
        int[] vetorIntereiros = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("posição:");
            vetorIntereiros[i] = scanner.nextInt();
        }

        ordenarVetorInt(vetorIntereiros);


    }

    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    private static void ordenarVetorInt(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        exibirVetor(vetor);
    }
}
