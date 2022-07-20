package com.greedysnakeproject;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    Game game;

    public KeyInput(Game game) {
        this.game = game;
    }

//    public void keyTyped (KeyEvent e) {
//        game.keyTyped(e);
//    }

    public void keyPressed (KeyEvent e) {
        game.keyPressed(e);
    }

//    public void keyReleased(KeyEvent e) {
//
//    }
}
