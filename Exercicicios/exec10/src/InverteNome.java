import java.util.Scanner;

public class InverteNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o nome");
        String nome = scanner.nextLine();
        inverteString(nome);

    }

    private static void inverteString(String nome){
        char[] letras = nome.toCharArray(); // array com cada letra do nome
        int esquerda = 0; // começo do vetor
        int direita = letras.length -1; // fim do vetor

        while (esquerda < direita) {
            char aux = letras[esquerda]; // referenciando o começo do vetor
            letras[esquerda] = letras[direita]; // mudando a primeira letra pela ultima letra
            letras[direita] = aux; // mudando a ultima letra pela primeira
            esquerda++; // andando com o index da esquerda para a direita
            direita--; // recuando com o index da direita para a esquerda
        }

        System.out.println(new String(letras));
    }
}
