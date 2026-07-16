import java.util.Scanner;

public class MatrizTresPorTres {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        montandoMatriz(matriz);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void montandoMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Escreva o numero para a posição " + i + " da matriz: ");
                matriz[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        mostrarMatriz(matriz);
    }
}

