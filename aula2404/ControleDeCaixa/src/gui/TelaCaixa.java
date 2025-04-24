package gui;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCaixa extends JFrame implements ActionListener {
    private Dimension dFrame, dTextField, dLabel, dButton, dTextArea;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;

    // construtor personalizado da janela
    public TelaCaixa() {
        // Dimensoes dos elementos
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(92, 20);
        dTextArea = new Dimension(300, 140);
        // Definindo o tamanho e comportamento da janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLocationRelativeTo(null); // centraliza a janela na tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // fecha o programa ao fechar a janela
        setLayout(null);
        setResizable(false); // nao redimensionar janela
        // criando os componentes
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdEntrada);

        cmdConsulta = new Button("Consultar");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdConsulta);

        cmdRetirada = new Button("Sacar");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        cmdRetirada.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        cmdSair.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}
