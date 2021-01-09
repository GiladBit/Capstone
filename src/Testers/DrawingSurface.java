package Testers;


import processing.core.PApplet;
import gbitton299.shapes.*;
import Player.*;

public class DrawingSurface extends PApplet {
	

	Player master;
	
	public DrawingSurface() {
		master = new Player();
	}
	

	public void setup() {

	}
	

	public void draw() {
		background(0);
		master.draw(this);
	
		
		
	}
	
	public void keyPressed() {
		if (key == 'w') {
			master.moveUp();
			
		}
		
		if (key == 'a') {
			master.moveLeft();
			
		}
		if (key == 'd') {
			
			master.moveRight();
		}
		
		if (key == 's') {
			master.moveDown();
			
		}
	}
	public void mousePressed() {
		
		
		
		
	}
	

	
	
	
	
	
}



