package gbitton299.shapes;
import processing.core.PApplet;

public class RegularPolygon extends Shape {

	private double sideLength;
	private int numSides;
	
	// constructors
	 public RegularPolygon(){
		 super(0, 0);
		 sideLength = 100;
		 numSides = 3;
	 }

	public RegularPolygon(double x, double y, int numSides, double sideLength){
		super(x, y);
		this.sideLength = sideLength;
		this.numSides = numSides;
	}
	

	// public methods
	public double calcr(){
		 return 0.5 * sideLength * (1/(Math.tan(Math.PI/numSides)));
	}
	 
	public double calcR(){
		return 0.5 * sideLength * (1/(Math.sin(Math.PI/numSides)));
	}

	public double calcVertexAngle(){
		return ((numSides-2)/numSides) * 180;
	}
	 
	public double calcPerimeter(){
		 return sideLength * numSides;
	}

	public double calcArea(){
		 double R = this.calcr();
		 return 0.5 * numSides * R * R * Math.sin((2*Math.PI)/numSides);
	}
	 
	public int getNumSides(){
		 return numSides;
	}
	 
	public double getSideLength(){
		 return sideLength;
	}
	 
	public void draw(PApplet drawer){
		 super.draw(drawer);
		 double x1 = x+calcR(), y1 = y;
	     int vertexAngle = (180*(numSides-2))/numSides;
	     double triangleAngle = 180-(vertexAngle/2);
	     if (vertexAngle>90) {
	         vertexAngle -= (vertexAngle-90)*2;
	     }
	     else if (vertexAngle<90) {
	         vertexAngle += (90-vertexAngle)*2;
	     }
	     for (int i = 0; i<numSides; i++) {
	         double radianangle = Math.toRadians((double)triangleAngle);
	         drawer.line((float)x1,(float)y1,(float)(x1 + Math.cos(radianangle) * sideLength), (float)(y1 + Math.sin(radianangle) * sideLength));
	         x1 = (x1 + Math.cos(radianangle) * sideLength);
	         y1 = (y1 + Math.sin(radianangle) * sideLength);
	         triangleAngle += vertexAngle;
	     }
	}
	 
	public void drawBoundingCircles(PApplet drawer){
		 drawer.circle((float)x, (float)y, (float)calcr());
		 drawer.circle((float)x, (float)y, (float)calcR());
	}
	 
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPointInside(double x, double y) {
		// TODO Auto-generated method stub
		boolean isPointInside = false;
		double d = Math.sqrt((this.x - x) * 2 + (this.y - y) * 2);
		if(d <= calcr() / 2) {
			isPointInside = true; 
		}
		return isPointInside;
	}



}
