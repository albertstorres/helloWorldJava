public class Professor extends Pessoa implements Usuario {
    private int salario;

    public Professor (String nome, String cpf, int salario) {
        super (nome, cpf);
        this.salario = salario;
    }

    public int getSalario () {
        return this.salario;
    }

    public void setSalario (int novo_salario) {
        this.salario = novo_salario;
    }
    @Override
    public void calcularPontos (int minutos) {
        int pontos = minutos * 3;
        this.setPontos(pontos);
    }

    @Override
    public String imprimirSaudacao () {
        return "Olá professor(a): "+ this.getNome();
    }
}
