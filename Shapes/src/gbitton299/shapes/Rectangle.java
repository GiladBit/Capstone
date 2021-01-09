package gbitton299.shapes;


import processing.core.PApplet;

/**
 * A class representing a rectangle and it's functionalities
 * @author Gilad Bitton
 * @version 10/15/2020
 */
public class Rectangle extends Shape {
	
	private double width, height;
	
	/**
	 * Creates a default instance of a Rectangle object with all dimensions
	 * set to zero.
	 */
	public Rectangle() {
		super(0, 0);
		width = 0;
		height = 0; 
	}
	
	/**
	 * Creates a new instance of a Rectangle object with the left and right
	 * edges of the rectangle at x and x + width. The top and bottom edges
	 * are at y and y + height.
	 * @param x X-coordinate of the rectangle
	 * @param y Y-coordinate of the rectangle
	 * @param width Width of the rectangle
	 * @param height Height of the rectangle
	 */
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height; 
	}
	
	/**
	 * Calculates and returns the perimeter of the rectangle
	 * @return Returns the perimeter of the rectangle
	 */
	public double getPerimeter() {
		double perimeter = 2 * Math.abs(width) + 2 * Math.abs(height);
		return perimeter;
	}
	
	/**
	 * Calculates and returns the area of the rectangle
	 * @return Returns the area of the rectangle
	 */
	public double getArea() {
		double area = Math.abs(width)* Math.abs(height);
		return area;
	}
	
	/**
	 *  Determines whether the point x,y is contained inside this rectangle
	 * @param x X-coordinate of point in the rectangle
	 * @param y Y-coordinate of point in the rectangle
	 * @return Returns if a point is inside the rectangle 
	 */
	public boolean isPointInside(double x, double y) {
		boolean isPointInside = false;
		if(x > this.x && x < this.x + width) {
			if(y > this.y && y < this.y + height) {
				isPointInside = true; 
			}
		}
		return isPointInside;
	}
	
	/**
	 * Draws the rectangle
	 * @param marker A PApplet object to used for drawing
	 */
	public void draw(PApplet marker) {
		super.draw(marker);
		marker.rect((float)this.x, (float)this.y, (float)width, (float)(Math.abs(height)));
	}
	
	/**
	 * Fills a rectangle with a randomly generated color
	 * @param marker A PApplet object to used for coloring
	 */
	public void fillRectangles(PApplet marker) {
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		marker.fill(r, g, b);
	}
	
	/**
	 * Moves the rectangle to where the mouse is pointing to
	 * @param marker A PApplet object to used for finding the mouse x and y coordinates
	 */
	public void moveRect(PApplet marker) {
		this.x = marker.mouseX;
		this.y = marker.mouseY;
	}
	
	/**
	 * 
	 * @return the width of the rectangle
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * 
	 * @return the height of the recatngle
	 */
	public double getHeight() {
		return height;
	}
	
}
