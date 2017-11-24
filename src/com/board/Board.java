/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.board;

import com.craft.Craft;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author dell
 */
public class Board extends JPanel implements ActionListener{
    private Timer timer;
    private Craft craft;
    private final int DELAY = 10;
    
    
    public Board(){
    initBoard();
    }
    
    private void initBoard(){
    
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.black);
        
        craft = new Craft();
        
        timer = new Timer(DELAY, this);
        timer.start();
    
    }
    
     @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }
    
      private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);        
    }
      
       @Override
    public void actionPerformed(ActionEvent e) {
        
        craft.move();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            craft.keyPressed(e);
        }
    }
      
      
}
