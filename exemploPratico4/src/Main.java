// A conta de energia elétrica de consumidores residenciais de uma cidade
// é calculada da seguinte maneira :
// I - Se o consumo é de até 500kw, a tarifa é de R$ 0,02 por kw;
// II - Se o consumo é maior que 500kw, mas não excede 100kw, a tarifa é R$ 10,00;
// III - Se o consumo é maior que 1000kw, a tarifa é R$ 35,00.
// Além disso, toda conta, é corada uma taxa básica de serviço de R$ 5,00, independente
// do consumo. O programa deve imprimir o valor da conta.

public class Main {
    public static void main (String[] args) {
        double consumo = 1501;
        double taxa_servico = 5;
        double tarifa;
        double conta;

        if (consumo <= 500) {
            tarifa = 0.02;
            conta = ((consumo * tarifa) + taxa_servico);
        } else if ((consumo > 500) && (consumo <= 1000)) {
            tarifa = 10;
            conta = ((consumo * tarifa) + taxa_servico);
        } else {
            tarifa = 35;
            conta = ((consumo * tarifa) + taxa_servico);
        }

        System.out.println(conta);
    }
}