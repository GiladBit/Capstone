package gbitton299.shapes;

import processing.core.PApplet;

/**
 * A class representing a circle and it's functionalities
 * @author Gilad Bitton
 * @version 10/15/2020
 */
public class Circle extends Shape {
	
	/**
	 * Creates a default instance of a Circle object with all dimensions
	 * set to zero.
	 */
	public Circle() {
		super(0, 0);
		diameter = 0; 
	}
	
	private double diameter;

	/**
	 * Creates a new instance of a Circle object
	 * @param x X-coordinate of the center of the circle
	 * @param y Y-coordinate of the center of the circle
	 * @param radius Radius of the circle
	 */
	public Circle(double x, double y, double diameter) {
		super(x, y);
		this.diameter = diameter; 
	}
	
	/**
	 * Calculates and returns the circumference of the Circle
	 * @return Returns the perimeter of the circle
	 */
	public double getPerimeter() {
		double perimeter = Math.abs(diameter) * Math.PI;
		return perimeter; 
	}
	
	/**
	 * Calculates and returns the area of the Circle
	 * @return Returns the area of the circle
	 */
	public double getArea() {
		double area = (Math.abs(diameter) / 2) * (Math.abs(diameter) / 2) * Math.PI;
		return area;
	}
	
	/**
	 *  Determines whether the point x,y is contained inside this Circle
	 * @param x1 X-coordinate of point
	 * @param y1 Y-coordinate of point
	 * @return Returns if a point is inside the circle 
	 */
	public boolean isPointInside(double x1, double y1) {
		boolean isPointInside = false;
		double d = Math.sqrt((x1 - x) * 2 + (y1 - y) * 2);
		if(d <= diameter / 2) {
			isPointInside = true; 
		}
		return isPointInside;
	}
	
	/**
	 * Draws the circle
	 * @param marker A PApplet object to used for drawing
	 */
	public void draw(PApplet marker) {
		super.draw(marker);
		marker.circle((float)x, (float)y, (float)(Math.abs(diameter)));
	}
	
	/**
	 * Fills a Circle with a randomly generated color
	 * @param marker A PApplet object to used for coloring
	 */
	public void fillCircles(PApplet marker) {
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		marker.fill(r, g, b);
	}
	
	/**
	 * Moves the Circle to where the mouse is pointing to
	 * @param marker A PApplet object to used for finding the mouse x and y coordinates
	 */
	public void moveCircle(PApplet marker) {
		x = marker.mouseX;
		y = marker.mouseY;
	}
	
	/**
	 * 
	 * @return The diameter of the circle
	 */
	public double getDiameter() {
		return diameter;
	}
	
}
