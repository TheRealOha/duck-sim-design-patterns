package ducksim;

import interfaces.IFlightBehaviour;
import interfaces.IQuackBehaviour;

public class BlackDuck extends Duck {
	
		public BlackDuck(String name, IQuackBehaviour qb, IFlightBehaviour fb) {
			super (name, qb, fb);
		}
		@Override
		public void swim() {
			System.out.println(name + " says: I'm a black duck, I can swim just fine, watch me!");
		}
		@Override
		public void land() {
			// TODO Automatisch generierter Methodenstub
			
		}
}
