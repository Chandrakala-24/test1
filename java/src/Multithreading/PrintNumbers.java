package Multithreading;

public class PrintNumbers extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		if(i==5) {
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
	public static void main(String args[]) {
		PrintNumbers thread=new PrintNumbers();
		thread.start();
			}
		}
		
