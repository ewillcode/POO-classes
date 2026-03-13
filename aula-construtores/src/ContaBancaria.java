public class ContaBancaria {
    private int numeroConta;
    private int agenciaConta;
    private String titularConta;
    private double saldoConta;
    private double limiteConta;

    public ContaBancaria(int numeroConta, int agenciaConta, String titularConta, double saldoConta, double limiteConta) {
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
        this.limiteConta = limiteConta;
    }

    public double getSaldo() {
        return saldoConta;
    }

    public void saqueConta(double saque) {
        if ((saldoConta + limiteConta) >= saque) {
            this.saldoConta -= saque;
        }
    }

    public void depositoConta(double deposito) {
        if(deposito > 0) {
            this.saldoConta += deposito;
        }
    }
}