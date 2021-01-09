package gbitton299.shapes;
import processing.core.PApplet;

/**
 * A class representing a line and it's functionalities  
 * @author Gilad Bitton
 * @version 10/15/2020
 */
public class Line extends Shape {
	
	private float ax2, ay2;
	
	/**
	 * Constructs a line from (x1, y1) to (x2, y2)
	 * @param x1 X-coordinate of first point
	 * @param y1 Y-coordinate of first point
	 * @param x2 X-coordinate of second point
	 * @param y2 Y-coordinate of second point
	 */
	public Line(double x1, double y1, double x2, double y2) {
		super(x1, y1);
		ax2 = (float)x2;
		ay2 = (float)y2;
	}
	
	/**
	 * Sets this line’s second point (x2, y2) to a new coordinate
	 * @param x2 X-coordinate of new point
	 * @param y2 Y-coordinate of new point
	 */
	public void setPoint2(double x2, double y2) {
		ax2 = (float)x2;
		ay2 = (float)y2;
	}
	
	/**
	 * Draws this line using the PApplet passed as an argument
	 * @param drawer A PApplet that it uses to draw the line
	 */
	public void draw(PApplet drawer) {
		super.draw(drawer);
		drawer.line((float)x, (float)y, ax2, ay2);
	}
	
	/**
	 * Returns the x coordinate of the intersection point of this line and the other line (assuming they continue forever)
	 * @param other The other line 
	 * @return The x coordinate of the intersection
	 */
	public double getIntersectionX(Line other) {
		double xInter = (((x*ay2-y*ax2)*(other.x-other.ax2))-((x-ax2)*(other.x*other.ay2-other.y*other.ax2))) / ((x-ax2)*(other.y-other.ay2) - (y-ay2)*(other.x-other.ax2));
		return xInter;
	}
	
	/**
	 * Returns the y coordinate of the intersection point of this line and the other line (assuming they continue forever)
	 * @param other The other line
	 * @return The x coordinate of the intersection
	 */
	public double getIntersectionY(Line other) {
		double yInter = (((x*ay2-y*ax2)*(other.y-other.ay2))-((y-ay2)*(other.x*other.ay2-other.y*other.ax2))) / (((x-ax2)*(other.y-other.ay2)) - ((y-ay2)*(other.x-other.ax2)));
		return yInter;
	}
	
	/**
	 * Returns true if this line segment and the segment other intersect each other. Returns false if they do not intersect.
	 * @param other The other line
	 * @return If the two lines intersect
	 */
	public boolean intersects(Line other) {
		boolean ifIntersects = false;
		if(x<=ax2) {
			if(y <= ay2 && x<=this.getIntersectionX(other) && ax2>=this.getIntersectionX(other) && y<=this.getIntersectionY(other) && ay2>=this.getIntersectionY(other)) {
				if(other.y <= other.ay2 && other.y<=this.getIntersectionY(other) && other.ay2>=this.getIntersectionY(other)) {
					ifIntersects = true;
				}
				else if(other.y >= other.ay2 && other.y>=this.getIntersectionY(other) && other.ay2<=this.getIntersectionY(other)) {
					ifIntersects = true;
				}
			}
			else if(x<=this.getIntersectionX(other) && ax2>=this.getIntersectionX(other) && ay2<=this.getIntersectionY(other) && y>=this.getIntersectionY(other)) { 
				if(other.y <= other.ay2 && other.y<=this.getIntersectionY(other) && other.ay2>=this.getIntersectionY(other)) {
					ifIntersects = true;
				}
				else if(other.y >= other.ay2 && other.y>=this.getIntersectionY(other) && other.ay2<=this.getIntersectionY(other)) {
					ifIntersects = true;
				}
			}
		}
		else if(x>=ax2) {
			if(y <= ay2 && ax2<=this.getIntersectionX(other) && x>=this.getIntersectionX(other) && y<=this.getIntersectionY(other) && ay2>=this.getIntersectionY(other)) {
				if(other.y <= other.ay2 && other.y<=this.getIntersectionY(other) && other.ay2>=this.getIntersectionY(other)) {
						ifIntersects = true;
				}
				else if(other.y >= other.ay2 && other.y>=this.getIntersectionY(other) && other.ay2<=this.getIntersectionY(other)) {
					ifIntersects = true;
				}
			}
			else if(ax2<=this.getIntersectionX(other) && x>=this.getIntersectionX(other) && ay2<=this.getIntersectionY(other) && y>=this.getIntersectionY(other)){ 
				if(other.y <= other.ay2) {
					if(other.y<=this.getIntersectionY(other) && other.ay2>=this.getIntersectionY(other)) {
						ifIntersects = true;
					}
				}
				else if(other.y >= other.ay2) {
					if(other.y>=this.getIntersectionY(other) && other.ay2<=this.getIntersectionY(other)) {
						ifIntersects = true;
					}
				}
			}
		}
		return ifIntersects;
	}

	@Override
	/**
	 * Returns the area of the line, which would always be zero
	 */
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/**
	 * Calculates the perimeter of the line
	 */
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double sideOne = Math.abs(y - ay2);
		double otherSide = Math.abs(x - ax2);
		return Math.sqrt(sideOne * sideOne + otherSide * otherSide);
	}

	@Override
	/**
	 * A point can't be inside a line therefore it would always be false.
	 */
	public boolean isPointInside(double x, double y) {
		// TODO Auto-generated method stub
		return false;
	}

}
