package day19.com.ict.deu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println(" main : " + Thread.currentThread().getName());
		Ex03_cat cat = new Ex03_cat();
		Ex02_dog dog = new Ex02_dog();
		
		// Runnable은 start 메서드를 가지고 있지 않으므로 오류 발생
		
//		Thread thread = new Thread(dog);
//		thread.start();
		
//		Thread thread2 = new Thread(cat);
//		thread2.start();
	
		// 익명
		new Thread(cat).start();

		// 익명 : new 클래스 (인터페이스 i) ;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println("AAAAAAAAAAAAAAAAA" + Thread.currentThread().getName());
				}
			}
		}).start();
		System.out.println(" main : " + Thread.currentThread().getName());
	}
}
