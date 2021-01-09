package Player;
import gbitton299.shapes.*;
import processing.core.PApplet;

public class Player {
	
	private int x,y, diameter;
	private Circle body;
	public Player() {
		x = 100;
		y = 100;
		diameter = 20;
		
	}
	
	
	public void draw(PApplet surface) {
		surface.circle((float)x, (float)y, (float)(Math.abs(diameter)));
	}
	
	public void act() {
		
	}

	

	public void moveUp(){
		if(isPointInside(x,10)) {
			return;
		}
		y -= 10;
	}

	public void moveDown(){
		if(isPointInside(x, 800)) {
			return;
		}
		y += 10;
	}

	public void moveRight(){
		if(isPointInside(1020, y)) {
			return;
		}
		x += 10;
	}

	public void moveLeft() {
		if(isPointInside(10, y)) {
			return;
		}
		x -= 10;
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
}
