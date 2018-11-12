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
	public void fly() {
		System.out.println( toString() + ", with a flight time of " + (int)((range/speed)*60) + " minutes.");
		
	}
	public String getModel() {
		return model;
	}
	
	
	public double getSpeedInMach() {
		double mach = this.speed/761.21;
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
