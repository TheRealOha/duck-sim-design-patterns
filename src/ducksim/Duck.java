package ducksim;

import interfaces.IFlightBehaviour;
import interfaces.IQuackBehaviour;

public abstract class Duck {

	private IQuackBehaviour quackType;
	private IFlightBehaviour flightType;
	protected String name;
	
	public Duck (String aName, IQuackBehaviour qb, IFlightBehaviour fb) {
		name = aName;
		quackType = qb;
		flightType = fb;
	}
	
	public void doDuckStuff() {
		fly();
		quack();
		land();
		swim();
	}
	public abstract void swim();

	public abstract void land(); 
	
	public void fly() {
		flightType.fly();
	}
	
	public void quack() {
		quackType.quack();
	}
}
