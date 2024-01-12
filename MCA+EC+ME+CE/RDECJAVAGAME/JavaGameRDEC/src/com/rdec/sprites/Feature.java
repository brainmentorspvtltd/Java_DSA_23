package com.rdec.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Feature {
	public int speed;
	int x;
	int y;
	int h; 
	int w;
	ImageIcon photo;
	
	
	public void drawSprite(Graphics brush) {
		brush.drawImage(photo.getImage(), x, y, w, h, null);
	}
	
	
}
