package Strings;

public class ManipulacaoStringReplaceSubstring {
    public static void main (String[] args) {
        String variavel = "banana";
        String novaString = variavel.replace("c", "co");
        String parteString = variavel.substring(1,4);

        System.out.println(novaString);
        System.out.println(parteString);
    }
}
