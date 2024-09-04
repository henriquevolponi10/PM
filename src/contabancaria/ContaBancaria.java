package contabancaria;

public class ContaBancaria {
    private String numeroConta;
    private String cpfProprietario;
    private double saldo;
    private double limite;
    private static final double TAXA_JUROS = 0.03; 

    public ContaBancaria(String numeroConta, String cpfProprietario, double limite) {
        this.numeroConta = numeroConta;
        this.cpfProprietario = cpfProprietario;
        this.saldo = 0.0; 
        this.limite = limite;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo + limite) { 
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque não permitido. Valor excede o limite.");
            return false;
        }
    }

    public void depositar(double valor) {
        if (saldo < 0) { 
            double taxa = -saldo * TAXA_JUROS;
            valor -= taxa; 
            System.out.println("Taxa de R$" + taxa + " aplicada sobre o saldo negativo.");
        }

        saldo += valor; 
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
}
