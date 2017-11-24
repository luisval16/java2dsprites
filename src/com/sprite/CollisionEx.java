/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprite;

import com.board.Board3;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class CollisionEx extends JFrame{
    public CollisionEx() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board3());
        
        setResizable(false);
        pack();
        
        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CollisionEx ex = new CollisionEx();
                ex.setVisible(true);
            }
        });
    }
}
