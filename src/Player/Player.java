package Player;
import gbitton299.shapes.*;
import processing.core.PApplet;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Player{
	
	private int x,y, diameter;
	private int ax,ay;
	private int health;
	
	public Player() {
	
		x = 100;
		y = 100;
		diameter = 40;
		health = 100;
		
	}
	
	


	public void draw(PApplet surface) {
		int secondX = surface.mouseX;
		int secondY = surface.mouseY;
		accelerate();
		//surface.circle((float)x, (float)y, (float)(Math.abs(diameter)));
		//surface.line(x, y, secondX, secondY);
		
	}

	

	public void act() {
		
	}

	


	//MOVE METHODS

	
	public void moveUp(){
		if(isPointInside(x,diameter + 10)) {
			return;
		}
		ay = -10;
	}

	public void moveDown(){
		if(isPointInside(x, 800 + diameter * 2)) {
			return;
		}
		ay = 10;
	}

	public void moveRight(){
		if(isPointInside(1000 + diameter * 2, y)) {
			return;
		}
		ax = 10;
	}

	public void moveLeft() {
		if(isPointInside(diameter / 2, y)) {
			return;
		}
		ax = -10;
	}



	public void accelerate(){
		double amount = 0.2;
		if(ax>0){
			ax -= amount;
		}
		else if (ax<0){
			ax += amount;
		}
		if(ay>0){
			ay -= amount;
		}
		else if(ay<0){
			ay += amount;
		}
		x += ax;
		y += ay;
	}





	//Hit Box Methods:

	public boolean isPointInside(double x1, double y1) {
		boolean isPointInside = false;
		double d = Math.sqrt((x1 - x) * 2 + (y1 - y) * 2);
		if (d <= diameter / 2) {
			isPointInside = true;
		}
		return isPointInside;
	}

	public void setHealth(int change) {
		health += change;
		if(health <= 0) {
			System.exit(1);
		}
	}


	public int getX(){
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDiameter() {
		return diameter;
	}
	
}
