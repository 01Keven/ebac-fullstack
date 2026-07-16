import java.util.Scanner;

public class PercorrendoMatriz {
    public static void main(String[] args) {
//        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];

//        matriz[0][0] = 5;
//        matriz[0][1] = 3;
//        matriz[0][2] = 4;
//        matriz[1][0] = 5;
//        matriz[1][1] = 3;
//        matriz[1][2] = 4;
//        matriz[2][0] = 5;
//        matriz[2][1] = 3;
//        matriz[2][2] = 4;

        for (int i = 0; i < matriz.length; i++) {
            // System.out.print(i + " ");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }

    }
        for (int i = 0; i < matriz.length; i++) {
            // System.out.print(i + " ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
        
        int somaTotalMatriz = 0;

        for (int[] linha : matriz) {
            for (int valorColuna : linha) {
                somaTotalMatriz += valorColuna;
            }
        }
        System.out.printf("valor total: %d", somaTotalMatriz);

    }
}
