package Testers;

import javax.swing.*;
import Enemies.*;
import processing.core.*;
import gbitton299.shapes.*;
import Player.*;
import java.lang.*;
/*
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
*/
public class DrawingSurface extends PApplet {
	

	

	Player master;
	Goblin enemy;
	private PImage photo;
	private PImage wand;
	private PImage dungeon1;
	private int counter;
	private int repeat;
	private boolean facingLeft;
	private double x;

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
		wand = loadImage("wand.png");
		dungeon1 = loadImage("dungeon1.png");
		photo.resize(128,128);
	}
	

	public void draw() {
		
		//if(enemy.Intersects(master)) {
			//master.setHealth(-10);
		//}

		//
	
		pushMatrix();
		
		image(dungeon1,500,400);
		master.draw(this);
		enemy.draw(this);
		animation();
		translate((float) master.getX(), (float) master.getY());
		x = setUpWand(master.getX2() - master.getX(), master.getY2() - master.getY());
		rotate((float) x);
		image(wand, 0,0);

		popMatrix();
		
		
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
	
	
	public void animation(){
		
		repeat++;
		if (repeat % 10 == 0) {
			counter++;
			if (counter > 6) {
				counter = 1;
			}
		}
		
		if (!facingLeft) {
			photo = loadImage("WIZARD" + counter + ".png");
		} else {
			photo = loadImage("LWIZARD" + counter + ".png");
		}

		image(photo, master.getX(), master.getY()-10,64,64);

	}

	public double setUpWand(double x, double y){
		return (Math.atan2(y,x));
	}
	
	
}



