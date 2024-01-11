package com.rdec.game;

import java.awt.Graphics;
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
	public Board() {
		setSize(1400, 700);
		showBackground();
		loop();
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
	
	
	public void paintComponent(Graphics brush) {
		super.paintComponent(brush);
		brush.drawImage(backGroundImage, 0, 0, 1400, 700, null);
		new Enemy().drawEnemy(brush);
		new Player().drawPlayer(brush);
	}
	
}
