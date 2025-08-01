package assignments;
class Animal{
	void eat() {
		System.out.println("Animal is eating");	
		}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}
public class Inheritance {
	public static void main(String args[]) {
	Animal a1=new Animal();
	a1.eat();
	a1.sleep();
}

}
