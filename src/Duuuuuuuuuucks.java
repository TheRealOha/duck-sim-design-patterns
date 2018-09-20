import ducksim.BlackDuck;
import ducksim.DeadDuck;
import ducksim.Duck;
import ducksim.PoolDuck;
import types.FlightTypeFlapFlap;
import types.FlightTypeNoFly;
import types.QuackTypeNoQuack;
import types.QuackTypeQuack;
import types.QuackTypeSqueak;

public class Duuuuuuuuuucks {

	public static void main(String[] args) {
		Duck deadDuck = new DeadDuck ("DeadDuck", new QuackTypeNoQuack(), new FlightTypeNoFly());
		Duck blackDuck = new BlackDuck("Blacky", new QuackTypeQuack(), new FlightTypeFlapFlap("150"));
		Duck poolDuck = new PoolDuck("Squeaky", new QuackTypeSqueak(), new FlightTypeNoFly());
		deadDuck.doDuckStuff();
		blackDuck.doDuckStuff();
		poolDuck.doDuckStuff();
	}

}
