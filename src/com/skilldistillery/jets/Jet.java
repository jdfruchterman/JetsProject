package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;

	public abstract String jet();

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;

	}

	// in abstract class because all child classes have this method
	public void fly() {
		System.out.println(toString() + ", has taken off, with a flight time of " + (int) ((range / speed) * 60)
				+ " minutes until it runs out of fuel.");

	}

	public String getModel() {
		return model;
	}

	// built this because it was in the UML, but is unused
	public double getSpeedInMach() {
		double mach = this.speed / 761.21;
		return mach;
	}

	public String toString() {
		String output = "Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price;
		return output;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
