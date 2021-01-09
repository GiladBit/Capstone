package sarah470.physicsshapedemo;
import processing.core.PApplet;
import gbitton299.shapes.*;

public class DrawingSurface extends PApplet {

	private PhysicsShape rectangle;
	private PhysicsShape[] circles = new PhysicsShape [20];
	
	public DrawingSurface() {
		rectangle = new PhysicsShape(new Rectangle(50, 50, 50, 50), false, true);
		for (int i = 0; i < 20; i++) {
			circles[i] = new PhysicsShape(new Circle(Math.random() * width, Math.random() * -height, 5), true, false);
		}
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {

	}
	
	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() {
		background(255);
		
		// DRAWING
		rectangle.draw(this);
		for (int i = 0; i < 10; i++) {
			circles[i].draw(this);
		}
		
		// CHANGING
		rectangle.act(width, height);
		for (int i = 0; i < 20; i++) {
			if (circles[i].getY() >= height-5) {
				 circles[i] = new PhysicsShape(new Circle(Math.random() * width, Math.random() * -height, 5), true, false);
			}
			if (rectangle.isPointInside(circles[i].getX(), circles[i].getY())) {
				circles[i].accelerate(0, -0.5);
			}
			circles[i].act();
		}
	}
	
	public void mouseDragged() {
		if (rectangle.isPointInside(mouseX, mouseY)) {
			rectangle.accelerate((mouseX-pmouseX)/10.0, (mouseY-pmouseY)/10.0);
		}
	}
	
}


