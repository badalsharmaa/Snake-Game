package com.badal.snakegamebybadal;

import javax.swing.JFrame;

public class GAME_FRAME extends JFrame {
    public GAME_FRAME(){
        this.add(new GAME_PANEL());
        this.setTitle("Snake Game By Badal");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
