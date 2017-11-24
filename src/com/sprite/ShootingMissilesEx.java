/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sprite;

import com.board.Board2;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class ShootingMissilesEx extends JFrame{
     public ShootingMissilesEx() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board2());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                ShootingMissilesEx ex = new ShootingMissilesEx();
                ex.setVisible(true);
            }
        });
    }
}
