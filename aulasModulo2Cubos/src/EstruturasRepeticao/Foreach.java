package EstruturasRepeticao;

public class Foreach {
    public static void main (String[] args) {
        int [] numeros = {1, 2, 3, 4};

        for (int numero : numeros) {
            System.out.print(numero + 1);
            System.out.print(" ");
        }
    }
}
