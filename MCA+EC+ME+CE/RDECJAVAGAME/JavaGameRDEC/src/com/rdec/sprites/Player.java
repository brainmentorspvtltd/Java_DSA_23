package com.rdec.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player {

	int x;
	int y;
	int h; 
	int w;
	ImageIcon photo;
	
	public Player() {
		x = 100;
		y = 400;
		h = 200;
		w = 150;
		photo = new ImageIcon(Player.class.getResource("player.gif"));
	}
	
//	public void loadPhoto() {
//      photo = new ImageIcon(Enemy.class.getResource("enemy.gif"));
//	}
	
	public void drawPlayer(Graphics brush) {
		brush.drawImage(photo.getImage(), x, y, w, h, null);
	}
	
}

