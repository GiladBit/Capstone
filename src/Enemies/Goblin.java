package Enemies;
import processing.core.PApplet;
import Player.*;

public class Goblin extends Enemy{

    

    public Goblin() {
        super();
		x = 200;
		y = 200;
		diameter = 40;
		health = 25;
	}

    public void makeGoblins(Player p) {
        if (Intersects(p)) {
            p.setHealth(-0.5);
        }

        act(p);
    }


    
}

