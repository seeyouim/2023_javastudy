package day19.com.ict.deu;

public class Ex03_cat implements Runnable{
	public void run() {
		while (true) {
			System.out.println("야옹~~~~야옹~~~~" + Thread.currentThread().getName());
		}
	}
}
