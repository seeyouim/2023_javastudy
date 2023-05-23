package day19.com.ict.deu;

public class Ex03_dog implements Runnable{
	public void run() {
		while (true) {
			System.out.println("멍~~~~멍~~~~~" + Thread.currentThread().getName());
		}
	}
}
