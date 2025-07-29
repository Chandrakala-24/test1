package Abstraction;

abstract class Vehicle {//abstract class
	public abstract void brand();//abstract method
	public static void main(String args[]) {
		Vehicle c=new Car();
		c.brand();
		Vehicle b=new Bike();
		b.brand();
}
}
