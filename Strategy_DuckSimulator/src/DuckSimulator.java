import Ducks.Duck;
import Ducks.MallardDuck;
import Ducks.WildDuck;
import FlyingBehaviors.FlyHigh;
import QuackBehaviors.Squiking;


//Strategy Pattern
public class DuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.show();
		mallard.makeFly();
		mallard.setFlying(new FlyHigh());
		mallard.makeFly();
		mallard.makeQuack();
		
		System.out.println();
		Duck wild = new WildDuck();
		wild.show();
		wild.makeQuack();
		wild.setQuacking(new Squiking());
		wild.makeQuack();
		wild.makeFly();
		
	}

}
