package types;

import interfaces.IFlightBehaviour;

public class FlightTypeFlapFlap implements IFlightBehaviour  {

	private String flapRate;
	public FlightTypeFlapFlap(String aFlapRate) {
		flapRate = aFlapRate;
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly with a flap rate of: " + flapRate);
		
	}

}
