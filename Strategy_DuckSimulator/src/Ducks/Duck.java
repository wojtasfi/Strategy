package Ducks;

import FlyingBehaviors.Flying;
import QuackBehaviors.Quacking;

public abstract class Duck  {
	
	Flying flying;
	Quacking quacking;
	
	public void setFlying(Flying flying){
		this.flying = flying;
	}
	
	public void setQuacking(Quacking quacking){
		this.quacking=quacking;
	}

	public void makeFly() {

		flying.fly();
	}
	
	public void makeQuack(){
		quacking.quack();
	}
	
	public abstract void show();

}
