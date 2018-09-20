package ducksim;

import interfaces.IFlightBehaviour;
import interfaces.IQuackBehaviour;

public class DeadDuck extends Duck {

	public DeadDuck(String name, IQuackBehaviour qb, IFlightBehaviour fb) {
		super(name, qb, fb);
	}
	@Override
	public void swim() {
		System.out.println(name + " says: I am dead, how should I swim?! "
				+ "Throw me in the water and I might float until I sink");
	}
	@Override
	public void land() {
		// TODO Automatisch generierter Methodenstub
		
	}
}
