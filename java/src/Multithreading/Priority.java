package Multithreading;
class PriorityThread extends Thread{
	public PriorityThread(String Name) {
		super(Name);
	}
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(getName()+"Priority:"+getPriority() +"Count:"+i);
	}
}
}
public class Priority {
	public static void main(String args[]) {
		 PriorityThread t1 = new PriorityThread("Thread-MAX");
	     PriorityThread t2 = new PriorityThread("Thread-NORM");
	     PriorityThread t3 = new PriorityThread("Thread-MIN");
	     t1.setPriority(Thread.MAX_PRIORITY);  
	     t2.setPriority(Thread.NORM_PRIORITY); 
	     t3.setPriority(Thread.MIN_PRIORITY);  
	     t1.start();
	     t2.start();
	     t3.start();
	}
}

