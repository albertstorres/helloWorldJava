public class Aluno extends Pessoa implements Usuario {
    public Aluno (String nome, String cpf) {
        super (nome, cpf);
    }

    @Override
    public void calcularPontos (int minutos) {
        int pontos = minutos * 2;
        this.setPontos(pontos);
    }

    @Override
    public String imprimirSaudacao () {
        return "Olá aluno(a): "+ this.getNome();
    }
}
