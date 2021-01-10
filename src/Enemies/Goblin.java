package Enemies;
import processing.core.PApplet;
import Player.*;

public class Goblin {

    private int x,y, diameter, health;

    public Goblin() {
		x = 200;
		y = 200;
		diameter = 40;
		health = 25;
	}

    	public void draw(PApplet surface) {
            surface.circle((float)x, (float)y, (float)(Math.abs(diameter)));
        }

        public boolean isPointInside(double x1, double y1) {
            boolean isPointInside = false;
            double d = Math.sqrt((x1 - x) * 2 + (y1 - y) * 2);
            if (d <= diameter / 2) {
                isPointInside = true;
            }
            return isPointInside;
        }

        public int getX(){
            return x;
        }
    
        public int getY() {
            return y;
        }

        public int getDiameter() {
            return diameter;
        }

        public boolean Intersects(Player p) {
		    float distanceX = p.getX() - getX();
		    float distanceY = p.getY() - getY();
		    float radiusSum = getDiameter() / 2 + p.getDiameter();
		    return distanceX * distanceX + distanceY * distanceY <= radiusSum * radiusSum;
	    }
	}
