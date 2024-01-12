package com.rdec.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player extends Feature{

	
	
	public Player() {
//		this.speed = speed;
		x = 100;
		y = 400;
		h = 200;
		w = 150;
		photo = new ImageIcon(Player.class.getResource("player.gif"));
	}
	
public void move() {
		
		if(x>1400) {
			x = 0;
		}
		
		x = x + speed;
	}
	
//	public void loadPhoto() {
//      photo = new ImageIcon(Enemy.class.getResource("enemy.gif"));
//	}
	
	
	
}

