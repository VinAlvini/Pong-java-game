package com.main;

import javax.swing.JFrame;

public class Window {
	Window(String title, Game game){
		JFrame jFrame = new JFrame(title);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);
		jFrame.add(game);
		jFrame.pack();
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		
		game.start();
		
	}

}