package ducksim;

import interfaces.IFlightBehaviour;
import interfaces.IQuackBehaviour;

public class PoolDuck extends Duck {

	public PoolDuck(String name, IQuackBehaviour qb, IFlightBehaviour fb) {
		super(name, qb, fb);
	}

	@Override
	public void swim() {
		System.out.println(name + " says: To be honest, I don't really swim, I float.");
	}

	@Override
	public void land() {
		// TODO Automatisch generierter Methodenstub
		
	}
}
