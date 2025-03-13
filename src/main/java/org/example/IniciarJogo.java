package org.example;

import javax.swing.*;

public class IniciarJogo extends JFrame {

    public static void main(String[] args) {
        new IniciarJogo();
    }

    IniciarJogo() {
        setUndecorated(true); // remove a borda da janela
        add(new TelaJogo());
        setTitle("Snake Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}