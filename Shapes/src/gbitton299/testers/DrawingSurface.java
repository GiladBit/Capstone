package gbitton299.testers;
import gbitton299.shapes.Circle;
import gbitton299.shapes.Rectangle;
import gbitton299.shapes.RegularPolygon;

import processing.core.PApplet;


public class DrawingSurface extends PApplet {

	Rectangle rectA;
	Rectangle rectB;
	Rectangle rectC;
	Circle circleA;
	Circle circleB;
	Circle circleC;
	RegularPolygon polygon;
	
	/**
	 * creates all the rectangles and circles required for testing
	 */
	public DrawingSurface() {
//		rectA = new Rectangle();
//		rectB = new Rectangle(0, 80, 400, 160);
//		rectC = new Rectangle(100, -100, 20, -300);
//		circleA = new Circle();
//		circleB = new Circle(0, 80, 160);
//		circleC = new Circle(100, -100, -300);
		polygon = new RegularPolygon(200, 200, 5, 10);
	}
	
	/**
	 * The statements in draw() are executed until the 
	 * program is stopped. Each statement is executed in 
	 * sequence and after the last line is read, the first 
	 * line is executed again.
	 */
	public void draw() { 
		background(255);   // Clear the screen with a white background
//		rectA.draw(this);
//		rectB.draw(this);
//		rectC.draw(this);
//		circleA.draw(this);
//		circleB.draw(this);
//		circleC.draw(this);
		polygon.draw(this);
//		if(mousePressed) {
//			rectB.moveRect(this);
//		}
//		if(keyPressed) {
//			if(key == 'w') {
//				rectB.fillRectangles(this);; 
//			}
//		}
	}

	
}










