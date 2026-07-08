import java.util.Scanner;

public class Tabuada {
    static int soma;
    static int multiplicacao;
    static int divisao;
    static int subtracao;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        soma = scanner.nextInt();
        multiplicacao = soma;
        divisao = soma;
        subtracao = soma;

        soma();
        multiplicacao();
        divisao();
        subtracao();

    }

    public static void soma() {
        System.out.println("---SOMA---");
        int numero = 1;
        while(numero <= 9) {
            int resultadoSoma = soma + numero;
            System.out.println(soma + "+" + numero + " = " +  resultadoSoma);
            numero++;
        }
        System.out.println("\n------\n");
    }

    public static void multiplicacao() {
        System.out.println("---MULTIPLICAÇÃO---");
        int numero = 1;
        while(numero <= 9) {
            int resultadoMultiplicacao = multiplicacao * numero;
            System.out.println(multiplicacao + "*" + numero + " = " +  resultadoMultiplicacao);
            numero++;
        }
        System.out.println("\n------\n");

    }

    public static void divisao() {
        System.out.println("\n---DIVISÃO---\n");
        double numero = 1;
        while(numero <= 9) {
            double resultadoDivisao = divisao / numero;
            System.out.println(divisao + "/" + numero + " = " +  resultadoDivisao);
            numero++;
        }
        System.out.println("\n------\n");

    }

    public static void subtracao() {
        System.out.println("\n---SUBTRAÇÃO---\n");
        int numero = 1;
        while(numero <= 9) {
            int resultadoSubtracao = subtracao - numero;
            System.out.println(subtracao + "-" + numero + " = " +  resultadoSubtracao);
            numero++;
        }
        System.out.println("\n------\n");
    }
}
