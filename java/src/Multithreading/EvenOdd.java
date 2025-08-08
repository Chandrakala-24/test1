package Multithreading;
class Even extends Thread{
	public void run() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
		}
	}
}
class Odd extends Thread{
	public void run() {
		for(int i=1;i<=20;i+=2) {
			System.out.println(i);
		}
	}
}
public class EvenOdd {
	public static void main(String args[]) {
		Even ev=new Even();
		Odd o=new Odd();
		ev.start();
		try {
			ev.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		o.start();
	}
}
		