package com.rdec.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy extends Feature{

	
	public Enemy(int x, int speed) {
		this.x = x;
		this.speed = speed;
		y = 100;
		h = 150;
		w = 150;
		photo = new ImageIcon(Enemy.class.getResource("enemy.gif"));
	}
	
//	public void loadPhoto() {
//      photo = new ImageIcon(Enemy.class.getResource("enemy.gif"));
//	}
public void move() {
		
		if(y>700) {
			y = 0;
		}
		
		y = y + speed;
	}
	
	
}
