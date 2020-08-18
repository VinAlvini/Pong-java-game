package com.main;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	public static final int SIZE = 16;
	
	private int x, y;
	private int xVel, yVel;  //1 or -1
	private int speed = 5;
	
	Ball(){
		reset();
	}

	private void reset() {
		//intital pos of ball
		x = Game.WIDTH/2 - SIZE/2;
		y = Game.HEIGHT/2 - SIZE/2;
		
		//initila velocity
		xVel = Game.sign(Math.random() * 2.0 -1);
		xVel = Game.sign(Math.random() * 2.0 -1);
	}
	
	public void changeYDir() {
		yVel *= -1;
	}
	public void changeXDir() {
		xVel *= -1;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
	    g.fillRect(x, y, SIZE, SIZE);
	}

}
