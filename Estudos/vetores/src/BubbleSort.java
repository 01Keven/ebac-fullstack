public class BubbleSort {
    public static void main(String[] args) {

        int[] vetorInt = new int[] {5, 33, 2, 10, 9};
        String[] vetorString = new String[] {"baa","aaaaaaa","d","ip",};

        ordenaVetorCrescente(vetorInt);
        ordenaStringTamanho(vetorString);
    }

    private static void exibeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    private static void exibeVetorString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    private static void ordenaStringTamanho(String[] vetorString) {
        for (int i = 0; i < vetorString.length; i++) {
            for (int j = i; j < vetorString.length; j++) {
                // Se a String for iguais retorna 0
                // Se o valor for maior doque 0 -> j maior
                // Se o valor for menor doque 0 -> i maior
                if (vetorString[j].compareTo(vetorString[i]) < 0) {
                    String aux = vetorString[i];
                    vetorString[i] = vetorString[j];
                    vetorString[j] = aux;
                }
            }
        }

        exibeVetorString(vetorString);
    }

    private static void ordenaVetorCrescente(int[] vetorInt) {
        // LAÇO EXTERNO (i): Define a posição que queremos preencher com o valor correto.
        // Ele avança casa por casa (0, 1, 2...) garantindo que o início do vetor fique ordenado.
        for (int i = 0; i < vetorInt.length; i++) {

            // LAÇO INTERNO (j): Varre o restante do vetor em busca de valores menores.
            // Começa em 'i' porque tudo o que está antes de 'i' já foi devidamente ordenado.
            for (int j = i; j < vetorInt.length; j++) {

                // CONDICIONAL DE TROCA: Verifica se o valor na posição atual da varredura (j)
                // é menor do que o valor que está travado na posição de referência (i).
                if (vetorInt[j] < vetorInt[i]) {

                    // --- MECANISMO DE SWAP (TROCA DE VALORES) ---

                    // 1. Salva o valor maior (da posição i) na variável temporária 'aux'
                    // para não perdê-lo na memória durante a sobrescrita.
                    int aux = vetorInt[i];

                    // 2. Transfere o valor menor (da posição j) para a posição atual de referência (i).
                    // Agora, temporariamente, as duas posições guardam o mesmo valor menor.
                    vetorInt[i] = vetorInt[j];

                    // 3. Recupera o valor maior que estava guardado na variável 'aux'
                    // e o coloca na posição original de onde veio o menor (posição j).
                    vetorInt[j] = aux;
                }
            }

        }
        exibeVetor(vetorInt);
    }
}