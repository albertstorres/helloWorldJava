package Strings;

public class ManipulacaoStringsTrimLength {
    public static void main (String[] args) {
        String variavel = "  Albert Sevy  ";
        int tamanhoVariavel = variavel.length();

        System.out.println(tamanhoVariavel);
        int tamanhoVariavelTrim = (variavel.trim()).length();

        System.out.println(tamanhoVariavelTrim);
    }
}
