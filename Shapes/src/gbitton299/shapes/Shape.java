package gbitton299.shapes;

import java.awt.Color;

import processing.core.PApplet;

/**
 * This is a class that represents the more abstract idea of a shape and what it is. 
 * @author Gilad Bitton
 * @version 10/15/2020
 */
public abstract class Shape {

	//FIELDS
	
	protected double x, y;
	protected int r, g, b;
	
	/**
	 * Creates a new instance of a shape in these coordinates.
	 * @param x X-coordinate of the shape
	 * @param y Y-coordinate of the shape
	 */
	public Shape(double x, double y) {
		r = 0;
		g = 0; 
		b = 0;
		this.x = x;
		this.y = y;
	}
	
	//METHODS
	
	/**
	 * A method used to draw the shape and set the color
	 * @param marker PApplet used for drawing
	 */
	public void draw(PApplet marker) {
		marker.fill(r, g, b);
	}
	
	/**
	 * An abstract method used to calculate the area of the shape by its subclasses
	 * @return The area of the shape
	 */
	public abstract double getArea();
	
	/**
	 * An abstract method used by its subclasses to calculate the perimeter 
	 * @return The perimeter of the shape
	 */
	public abstract double getPerimeter();
	
	/**
	 * An abstract method used by the subclasses to calculate if a point is inside the shape
	 * @param x X-coordinate of the shape
	 * @param y Y-coordinate of the shape
	 * @return Returns a boolean if the point is inside or not
	 */
	public abstract boolean isPointInside(double x, double y); 
	
	/**
	 * Sets the x coordinate of the shape
	 * @param x The new x coordinate
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * Sets the y coordinate of the shape
	 * @param y The new y coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Returns the current x-coordinate of the shape
	 * @return X-coordinate of shape
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Returns the current y-coordinate of the shape
	 * @return Y-coordinate of shape
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Sets the red value of the color
	 * @param r The red value
	 */
	public void setRed(int r) {
		this.r = r;
	}
	
	/**
	 * Sets the green value of the color
	 * @param g The green value
	 */
	public void setGreen(int g) {
		this.g = g;
	}
	
	/**
	 * Sets the blue value of the color
	 * @param b The blue value
	 */
	public void setBlue(int b) {
		this.b = b;
	}
	
	/**
	 * Sets the shape to a new color
	 * @param marker The PApplet used for changing color
	 */
	public void setColor(PApplet marker) {
		marker.fill(r, g, b);
	}
	
	
}
