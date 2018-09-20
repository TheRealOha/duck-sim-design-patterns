package types;

import interfaces.IFlightBehaviour;

public class FlightTypeNoFly implements IFlightBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly.");
	
	}

}
