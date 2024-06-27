package EstruturasRepeticao;

public class For {
    public static void main (String[] args) {
        int [] array_numeros = {1, 2, 3, 4};
        String [][] matriz_nomes = new String [2][2];

        matriz_nomes[0][0] = "Guido";
        matriz_nomes[0][1] = "João";
        matriz_nomes[1][0] = "Maria";
        matriz_nomes[1][1] = "Antonia";

        for (int i = 0; i < array_numeros.length; i++) {
            System.out.println(array_numeros[i]);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++){
                System.out.print(matriz_nomes[i][j]);
                System.out.print(" ");
            }
        }

    }
}
