package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane (String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
//	@Override
//	public void fly() {
//		// TODO Auto-generated method stub
//
//	}

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
	public void loadCargo() {
		System.out.println(this.getModel() + " has been loaded with cargo.");
	}

}
