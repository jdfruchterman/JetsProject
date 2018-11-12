package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet (String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}


	@Override
	public double getSpeedInMach() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String jet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fight() {
		System.out.println(this.getModel() + " attacks with its guns and missiles. WHOOSH! AKKA AKKA! BOOM!");
	}

}
