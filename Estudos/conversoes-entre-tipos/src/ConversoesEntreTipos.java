public class ConversoesEntreTipos {

    static void main(String[] args) {
        int numeroInteiro = 10;
        double numeroDouble = 5.0;

        // Usando casting para indicar que o numero vai converter para inteiro
        numeroInteiro = (int) numeroDouble;

        System.out.println(numeroInteiro);

        // Casting para metodo String
        String tipoString = String.valueOf(numeroInteiro);
        System.out.println(tipoString);

        // Casting String para int
        int tipoInt = Integer.parseInt(tipoString);

        System.out.println(tipoInt);

        String numeroString = "2";

        int numeroDois = Integer.parseInt(numeroString);

        System.out.println(numeroDois + 10);


    }

}
