import java.util.Scanner;


public class QuantidadeVogais {
    static int contadorVogais = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho do vetor:");
        int tamanhoVetor = scanner.nextInt();
        int[] vetorIntereiros = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("qual numero: ");
            vetorIntereiros[i] = scanner.nextInt();
        }

        ordenarVetorInt(vetorIntereiros);
        scanner.nextLine();
        System.out.println("------------------------------");
        System.out.println("\nDigite uma palavra");
        String palavra = scanner.nextLine();
        quantidadeDeVogais(palavra);
    }

    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("numero: " + vetor[i]);
        }
    }

    private static void quantidadeDeVogais(String palavra) {
        palavra = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {

            char primeiraLetra =  palavra.charAt(i);
            if (primeiraLetra == 'a') {
                contadorVogais+= 1;
            } else if (primeiraLetra == 'e') {
                contadorVogais+= 1;
;
            } else if (primeiraLetra == 'i') {
                contadorVogais+= 1;
;
            } else if (primeiraLetra == 'o') {
                contadorVogais+= 1;
;
            } else if (primeiraLetra == 'u') {
                contadorVogais+= 1;
;
            }
        }
            System.out.println("Vogais igual a: " + contadorVogais);

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
