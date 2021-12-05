package Entities;

public class Account {

    private int numero;
    private String titular;
    private double saldo;

    public Account(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;

    }

    public Account(int numero, String titular, double initialDeposit) {
        this.numero = numero;
        this.titular = titular;
        deposit(initialDeposit);
    }

    public int getnumero() {
        return numero;
    }

    public String gettitular() {
        return titular;
    }

    public void settitular(String titular) {
        this.titular = titular;
    }

    public double getsaldo() {
        return saldo;
    }

    public void deposit(double amount) {
        saldo += amount;
    }

    public void withdraw(double amount) {

           saldo -= amount;

    }

    public String toString() {
        return "Conta Corrente "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }
}
