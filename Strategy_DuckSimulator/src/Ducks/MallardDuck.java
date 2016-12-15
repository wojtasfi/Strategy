package Ducks;

import FlyingBehaviors.NoFly;
import QuackBehaviors.LoudQuacking;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		flying = new NoFly();
		quacking = new LoudQuacking();
	}

	@Override
	public void show() {

		System.out.println("Mallard Duck");
	}

}
