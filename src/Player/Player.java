package Player;
import idothegoat.shapes.*;
import processing.core.PApplet;

public class Player {
	
	private int x,y;
	private Circle body;
	public Player() {
		x = 100;
		y = 100;
		body = new Circle(x,y,20);
	}
	
	public void draw(PApplet surface) {
		body.fillCircles(surface);
		surface.stroke(100);
		body.draw(surface);
	}
	
	public void act() {
		
	}

	public void moveUp(){
		y -= 10;
	}

	public void moveDown(){
		y += 1;
	}

	public void moveRight(){
		x += 10;
	}

	public void moveLeft() {
		x -= 10;
	}
}
