package EstruturasRepeticao;

public class While {
    public static void main (String[] args) {
        int [] numeros = {1, 2, 3, 4};
        int i = 0;

        while (i < numeros.length) {
            System.out.print(" " + numeros[i]);
            i++;
        }
    }
}
