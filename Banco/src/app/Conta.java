package app;
import java.util.Random;
public class Conta {
    private int num;
    private String titular;
    private double saldo;
    private double limite;

    public Conta(String titular){
        this.num = gerarNumeroConta();
        this.titular = titular;
        this.saldo = 0;
        this.limite = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite < 0){
            System.out.println("Erro em alteração!");
            System.out.println("O limite não pode ser negativo!");
        }
        else{
            this.limite = limite;
            System.out.println("Alteração feita com sucesso!");
            System.out.println("O limite de "+ this.titular + " é de R$"+ this.limite);
            mostrarDados();
        }
    }

    public void mostrarDados(){
        System.out.println("==========Banco==========");
        System.out.println("Numéro Conta: " + this.num);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("========================");
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Deposito não efetuado!");
            System.out.println("Valores menores que zero ou igual a zero não podem ser depositados!!");
        }
        else {
            this.saldo += valor;
            System.out.println("Deposito efetuado!");
            System.out.println("Saldo Atual: " + this.saldo + " | Valor depositado: " + valor);
        }
    }

    public void sacar(double valor){
        if(valor > this.saldo ){
            System.out.println("Saque não efetuado!");
            System.out.println("Valores maiores que o valor em conta não podem ser sacados!!!");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque efetuado!");
            System.out.println("Saldo Atual: " + this.saldo + " | Valor sacado: " + valor);
        }
    }

    public static int gerarNumeroConta() {
        Random random = new Random();
        int primeiroDigito = random.nextInt(9) + 1;
        int numeroConta = primeiroDigito;

        for (int i = 1; i < 10; i++) {
            int digito = random.nextInt(10);
            numeroConta = numeroConta * 10 + digito;
        }

        return numeroConta;
    }

}