package Testers;


import processing.core.PApplet;
import idothegoat.shapes.*;
import Player.*;

public class DrawingSurface extends PApplet {
	

	Player bruh;
	
	public DrawingSurface() {
		bruh = new Player();
	}
	

	public void setup() {

	}
	

	public void draw() {
		background(255);
		bruh.draw(this);
	
		
		
	}
	
	public void keyPressed() {
		if (key == 'w') {
			
			
		}
		
		if (key == 'd') {
			
			
		}
		if (key == 'a') {
			
			
		}
		
		if (key == 's') {
			
			
		}
	}
	public void mousePressed() {
		
		
		
		
	}
	

	
	
	
	
	
}



