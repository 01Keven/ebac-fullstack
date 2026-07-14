import java.util.Scanner;
import java.math.*;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho do Vetor");
        int tamanhoVetor = scanner.nextInt();
        int[] inteirosVetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("numero:");
            inteirosVetor[i] = scanner.nextInt();
        }

        alteraValorParEImpar(inteirosVetor);

    }

    private static void alteraValorParEImpar(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int par = vetor[i] % 2;

            if (par == 0) {
                vetor[i] *= 2;
                System.out.println("par " + vetor[i]);
            } else {
                int intResult = (int) Math.pow(vetor[i], 2);
                vetor[i] = intResult;
                System.out.println("impar " + vetor[i]);
            };
        }


    }
}
