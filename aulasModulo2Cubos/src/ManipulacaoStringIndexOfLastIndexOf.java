public class ManipulacaoStringIndexOfLastIndexOf {
    public static void main (String[] args) {
        String variavel = "banana";
        int primeiraOcorrencia = variavel.indexOf("n", 3);
        int ultimaOcorrencia = variavel.lastIndexOf("n", 3);

        System.out.println(primeiraOcorrencia);
        System.out.println(ultimaOcorrencia);
    }
}
