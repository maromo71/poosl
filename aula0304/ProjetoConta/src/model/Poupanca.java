package model;

public class Poupanca extends Conta  {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Taxa Juros: " + taxaJuros);
    }
}
