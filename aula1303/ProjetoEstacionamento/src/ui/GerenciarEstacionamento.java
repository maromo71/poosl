package ui;

import model.Carro;
import model.Cliente;

public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Cliente maromo = new Cliente();
        maromo.setNome("Marcos Roberto de Moraes");
        maromo.setEmail("maromo@gmail.com");
        maromo.setTelefone("11 9999-9999");
        maromo.imprimir();
        System.out.println();
        Carro pulse = new Carro();
        pulse.setModelo("Pulse");
        pulse.setMarca("Fiat");
        pulse.setPlaca("ABC-1234");
        pulse.setAnoFab(2023);

        Carro santafe = new Carro();
        santafe.setModelo("Santa Fé");
        santafe.setMarca("Hyundai");
        santafe.setPlaca("DEF-5678");
        santafe.setAnoFab(2018);

        maromo.adicionarCarro(pulse);
        maromo.adicionarCarro(santafe);
        maromo.imprimir();

        maromo.removerCarro(pulse);
        System.out.println();
        maromo.imprimir();
    }
}
