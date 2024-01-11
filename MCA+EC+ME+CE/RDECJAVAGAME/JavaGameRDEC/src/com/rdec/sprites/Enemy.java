package com.rdec.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy {

	int x;
	int y;
	int h; 
	int w;
	ImageIcon photo;
	
	public Enemy() {
		x = 1000;
		y = 100;
		h = 150;
		w = 150;
		photo = new ImageIcon(Enemy.class.getResource("enemy.gif"));
	}
	
//	public void loadPhoto() {
//      photo = new ImageIcon(Enemy.class.getResource("enemy.gif"));
//	}
	
	public void drawEnemy(Graphics brush) {
		brush.drawImage(photo.getImage(), x, y, h, w, null);
	}
	
}
