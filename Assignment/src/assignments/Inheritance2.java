package assignments;

class Bird{
	void eat() {
		System.out.println("Bird is eating");
	}
	void sleep() {
		System.out.println("Bird is sleeping");
	}
	void fly() {
		System.out.println("Bird is flying");
	}
}
public class Inheritance2 {
	public static void main(String args[]) {
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
