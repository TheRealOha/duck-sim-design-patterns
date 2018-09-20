package types;

import interfaces.IFlightBehaviour;

public class FlightTypeGlide implements IFlightBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm gliding through the air without any effort!");
	
	}

}
