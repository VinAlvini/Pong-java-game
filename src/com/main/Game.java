package com.main;

import java.awt.Canvas;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable{
	
	public static final int WIDTH =1000;
	public static final int HEIGHT =WIDTH * 9/16;
	public Game() {
		canvasSetup();
		new Window("Pong", this);
		
	}
	private void canvasSetup() {
		this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		
	}
	public void start() {
		//game start
		
	}
	@Override
	public void run() {
		
		
	}
	public static void main(String[] args) {
		new Game();
		
	}

}
