package types;

import interfaces.IQuackBehaviour;

public class QuackTypeQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack, quack quack!");
		
	}

}
