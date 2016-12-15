package Ducks;

import FlyingBehaviors.JetEngines;
import QuackBehaviors.Mute;

public class WildDuck extends Duck {

	
	public WildDuck(){
		flying = new JetEngines();
		quacking = new Mute();
	}
	public void show() {

		System.out.println("Wild Duck");
	}

}
