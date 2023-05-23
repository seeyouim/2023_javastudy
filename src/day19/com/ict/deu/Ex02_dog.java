package day19.com.ict.deu;

public class Ex02_dog extends Thread{
	public void start() {
		for(int i =0; i<20; i++ ) {
			System.out.println("멍~~~멍~~~" + Thread.currentThread().getName());
		}
	}
	
	@Override
	public void run() {
		for(int i =0; i<20; i++ ) {
			System.out.println("멍~~~멍~~~" + Thread.currentThread().getName());
		}
	}
}
