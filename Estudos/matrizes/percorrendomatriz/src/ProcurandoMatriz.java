import java.util.Scanner;

public class ProcurandoMatriz {
    public static void main(String[] args) {
        String[][] listaProdutos = new String[3][3];

        listaProdutos[0][0] = "335";
        listaProdutos[0][1] = "Pc";
        listaProdutos[0][2] = "3.355";

        listaProdutos[1][0] = "336";
        listaProdutos[1][1] = "mouse";
        listaProdutos[1][2] = "2.355";

        listaProdutos[2][0] = "337";
        listaProdutos[2][1] = "tv";
        listaProdutos[2][2] = "35.355";

        for (String[] produto : listaProdutos) {
            for (String dadoProduto : produto) {
                System.out.printf("%s ", dadoProduto);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        String codigoDoProduto = scanner.nextLine();
        boolean encontrouProduto = false;

        for (String[] produto : listaProdutos) {
            if (produto[0].equals(codigoDoProduto)) {
                System.out.println("Codigo: " + produto[0] + " Nome: " + produto[1] + " Preço: " + produto[2]);
                encontrouProduto = true;
                break;
            }

        }
        if (!encontrouProduto) {
            System.out.println("não encontrado!!");
        }
    }
}
