package sarah470.physicsshapedemo;
import processing.core.*;
import gbitton299.shapes.*;

public class PhysicsShape {

	private Shape s;
	private double vx, vy;
	
	private double gravity = 0.05;
	private double friction = 0.98;
	
	private boolean hasGravity = false;
	private boolean hasFriction = false;
	
	public PhysicsShape(Shape s) {
		this.s = s;
		vx = 0;
		vy = 0;
	}
	
	public PhysicsShape(Shape s, boolean hasGravity, boolean hasFriction) {
		this.s = s;
		vx = 0;
		vy = 0;
		this.hasGravity = hasGravity;
		this.hasFriction = hasFriction;
	}
	
	public void draw(PApplet surface) {
		s.draw(surface);
	}
	
	public boolean isPointInside(double x, double y) {
		return s.isPointInside(x, y);
	}
	
	public double getX() {
		return s.getX();
	}
	
	public double getY() {
		return s.getY();
	}
	
	public void act() {
		s.setX(s.getX() + vx);
		s.setY(s.getY() + vy);
		
		if(hasFriction) {
			vx *= friction;
			vy *= friction;
		}
		
		if (hasGravity) {
			vy += gravity;
		}
	}
	
	public void act(double width, double height) {
		
		if (s.getX() <= 0 || s.getX() >= width) {
			vx = -vx;
		}
		
		if (s.getY() <= 0 || s.getY() >= height) {
			vy = -vy;
		}
		
		this.act();
		
	}
	
	public void accelerate(double ax, double ay) {
		vx += ax;
		vy += ay;
	}
	
}
