package Testers;

import javax.swing.*;
import Enemies.*;
import processing.core.*;
import gbitton299.shapes.*;
import Player.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingSurface extends PApplet {
	

	

	Player master;
	Goblin enemy;
	private PImage photo;
	private int counter;
	private int repeat;
	private boolean facingLeft;

	public DrawingSurface() {
		master = new Player();
		enemy = new Goblin();
		counter = 1;
		repeat = 0;
	}
	

	public void setup() {
		long start = System.currentTimeMillis();
		imageMode(CENTER);
		size(100,100);
		photo = loadImage("WIZARD"+1+".png");
		photo.resize(64,64);
	}
	

	public void draw() {
		
		if(enemy.Intersects(master)) {
			master.setHealth(-10);
		}
		if(keyPressed) {
			repeat++;
			if(repeat % 10 == 0){
				counter++;
				if (counter > 6) {
					counter = 1;
				}
			}
		}
		
		background(129,129,129);
		master.draw(this);
		enemy.draw(this);

		if(!facingLeft){
			photo = loadImage("WIZARD" + counter + ".png");
		}
		else{
			photo = loadImage("LWIZARD" + counter + ".png");
		}
		
		image(photo, master.getX(), master.getY());
	}
	
	public void keyPressed() {
		
		if (key == 'w') {
			
			master.moveUp();
			
		}
		
		if (key == 'a') {
			facingLeft = true;
			master.moveLeft();
			
		}
		if (key == 'd') {
			facingLeft = false;
			master.moveRight();
		}
		
		if (key == 's') {
			
			master.moveDown();
			
		}
	}
	public void mousePressed() {
		
		
		
		
	}
	
	
	
	
}



