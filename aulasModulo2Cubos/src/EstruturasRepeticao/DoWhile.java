package EstruturasRepeticao;

public class DoWhile {
    public static void main (String[] args) {
        int [] numeros = {1, 2, 3, 4};
        int i = 0;

        do {
            System.out.print(" " + numeros[i]);
            i++;
        } while (i < numeros.length);
    }
}
