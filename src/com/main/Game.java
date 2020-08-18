package com.main;

import java.awt.BasicStroke;
import java.awt.BufferCapabilities;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferStrategy;


public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -5113352363335353360L;
	public static final int WIDTH =1000;
	public static final int HEIGHT =WIDTH * 9/16;
	
	public boolean running =false;
	private Thread gameThread;
	
	
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
			this.requestFocus();
			
			//game timer
			
			long lastTime = System.nanoTime();
			double amountTicks = 60.0;
			double ns = 1000000000;
			double delta = 0;
			long timer = System.currentTimeMillis();
			int frame = 0;
			boolean running = false;
			while (running) {
				long now = System.nanoTime();
				delta += (now - lastTime) / ns;
				lastTime = now;
				while (delta >= 1) {
					update();
					delta--;
					draw();
					frame++;
				}
				
				if (System.currentTimeMillis() - timer > 1000) {
					timer += 1000;
					System.out.println("frame per second "+frame);
					frame =0;
				}
			}
			stop();
		}
		
	private void update() {
		// TODO Auto-generated method stub
		
	}
	private void draw() {
		//initialize draw tools
		
				BufferStrategy buffer = this.getBufferStrategy();
				if (buffer == null) {
					createBufferStrategy(3);
					return;
				} 
				Graphics g = buffer.getDrawGraphics(); 
				
				//draw background
			    drawBackgroung(g); 
				
				//draw ball
				//ball.draw(g);
				 
				//draw paddle and score
				//paddle1.draw(g);
				//paddle2.draw(g);
				 
				//disposal draw
				g.dispose();
				buffer.show();
		
	}
	private void drawBackgroung(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		//dotted white line 
		g.setColor(Color.white);
	    Graphics2D g2d = (Graphics2D) g;
	    Stroke dottedStroke = new BasicStroke(3,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,0, new float[] {10},0);
	    g2d.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT);
	}
	private void stop() {
		
		
	}
	public static void main(String[] args) {
		new Game();
		
	}
	public static int sign(double d) {
		
		return 0;
	}

}
