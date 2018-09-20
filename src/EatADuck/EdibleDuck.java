package EatADuck;

import ducksim.Duck;
import interfaces.IFlightBehaviour;
import interfaces.IQuackBehaviour;

public interface EdibleDuck extends Duck {

	public EdibleDuck(String aName, IQuackBehaviour qb, IFlightBehaviour fb) {
		super(aName, qb, fb);
		// TODO Automatisch generierter Konstruktorstub
	}

}
