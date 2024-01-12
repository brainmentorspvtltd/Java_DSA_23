package com.rdec.game;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame() {
		setTitle("JAVA GAME");
		setSize(1400, 700);
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		setVisible(true);
	}

	public static void main(String ... args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame();
	}

}
