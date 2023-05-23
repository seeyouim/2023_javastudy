package day19.com.ict.deu;

public class Ex02_cat extends Thread{
	public void start() {
		for(int i =0; i<20; i++ ) {
			System.out.println("야옹~~~~~야옹~~~~~~" + Thread.currentThread().getName());
		}
	}
	
	
	@Override
	public void run() {
		for(int i =0; i<20; i++ ) {
			System.out.println("야옹~~~~~야옹~~~~~~" + Thread.currentThread().getName());
		}
	}
}
