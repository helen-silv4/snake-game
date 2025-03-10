package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TelaJogo extends JPanel implements ActionListener {

    private static final int LARGURA_TELA =  1300;
    private static final int ALTURA_TELA = 750;

    private static final int TAMANHO_BLOCO = 50;
    private static final int UNIDADES = LARGURA_TELA * ALTURA_TELA / (TAMANHO_BLOCO * TAMANHO_BLOCO);
    private static final int INTERVALO = 200; // velocidade da cobrinha
    private static final String NOME_FONTE = "Ink Free";
    private final int[] eixoX = new int[UNIDADES];
    private final int[] eixoY = new int[UNIDADES];
    private int corpoCobra = 6;
    private int blocosComidos;
    private int blocoX;
    private int blocoY;
    private char direcao = 'D'; // C - coma, B - baixo, E - esquerda, D - direita
    private boolean estaRodando = false;
    Timer timer;
    Random random;

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
