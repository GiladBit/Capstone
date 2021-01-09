package Player;

import idothegoat.shapes.*;
import processing.core.PApplet;

public class Player {
	
	private int x,y;
	private Circle s;
	public Player() {
		x = 100;
		y = 100;
		s = new Circle();
	}
	
	public void draw(PApplet surface) {
		s.draw(surface);
	}
	
	public void act() {
		
	}
}
