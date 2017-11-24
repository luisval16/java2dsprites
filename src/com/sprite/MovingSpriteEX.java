/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprite;

import com.board.Board;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class MovingSpriteEX extends JFrame{
     public MovingSpriteEX() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("Moving sprite");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                MovingSpriteEX ex = new MovingSpriteEX();
                ex.setVisible(true);
            }
        });
    }
}
