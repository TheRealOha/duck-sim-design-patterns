package types;

import interfaces.IQuackBehaviour;

public class QuackTypeNoQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("You spot something staring at you. You approach and poke it with a stick. Does it make a sound? "
				+ "No.. It's mute.");
	}

}
