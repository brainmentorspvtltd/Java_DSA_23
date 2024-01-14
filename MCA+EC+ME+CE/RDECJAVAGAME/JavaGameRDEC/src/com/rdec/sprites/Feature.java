package com.rdec.sprites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Feature {
	public int speed;
	public int x;
	public int y;
	public int h; 
	public int w;
	ImageIcon photo;
	
	
	public void drawSprite(Graphics brush) {
		brush.drawImage(photo.getImage(), x, y, w, h, null);
	}
	
	
}
