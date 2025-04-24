package model;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
