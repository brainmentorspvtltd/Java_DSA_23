package com.rdec.game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.rdec.sprites.Enemy;
import com.rdec.sprites.Player;

public class Board extends JPanel {
	BufferedImage backGroundImage;
	Timer timer;
	Enemy enemies [] = new Enemy [3];
	Player player;
	public Board() {
		setSize(1400, 700);
		showBackground();
		loop();
		displayEnemies();
		player = new Player();
		keyBoard();
		setFocusable(true);
		
	}
	
	public void displayEnemies() {
		int x = 800;
		int gap = 200;
		int speed = 5;
		for(int i = 0; i <enemies.length; i ++) {
			enemies[i] = new Enemy(x, speed);
			x = x + gap;
			speed = speed + 5;
		}
	}
	
	public void paintEnemy(Graphics brush) {
		for(Enemy e : enemies) {
			e.drawSprite(brush);
			e.move();
		}
	}
	
	public void paintPlayer(Graphics brush) {
		player.drawSprite(brush);
		player.move();
	}
	
	
	public void showBackground() {
		try {
			backGroundImage = ImageIO.read(Board.class.getResource("game-bg.jpg"));
		} catch (IOException e) {
			System.out.println("No image found");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void loop() {
		timer = new Timer(50, (e)-> repaint());
		timer.start();
	}
	
	
	public void keyBoard() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == e.VK_LEFT) {
					player.speed = -5;
				}
//				player.speed = 0;
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				if(e.getKeyCode() == e.VK_RIGHT) {
					player.speed = 5;
				}
				
				
			}
		});
	}
	
	
	public void paintComponent(Graphics brush) {
		super.paintComponent(brush);
		brush.drawImage(backGroundImage, 0, 0, 1400, 700, null);
//		new Enemy().drawEnemy(brush);
		paintEnemy(brush);
		paintPlayer(brush);
	}
	
}
