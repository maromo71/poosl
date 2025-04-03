package view;

import model.Corrente;
import model.Poupanca;

public class GerenciarConta {
    public static void main(String[] args) {
        //Criar um instancia de CC e uma de Poupanca
        Corrente cc = new Corrente();
        cc.setNumConta(123);
        cc.setNomeCliente("Maria");
        cc.setLimite(1500);
        boolean depositou = cc.depositar(1000);
        if(depositou) {
            System.out.println("Deposito efetuado com sucesso!");
        } else {
            System.out.println("Erro ao realizar o deposito.");
        }
        boolean sacou = cc.sacar(1200);
        if(sacou) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Erro ao realizar o saque.");
        }
        System.out.println("Saldo atual: " + cc.getSaldo());
        
    }
}
