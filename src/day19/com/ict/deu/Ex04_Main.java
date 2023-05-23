package day19.com.ict.deu;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_cat cat = new Ex04_cat();
		Ex04_dog dog = new Ex04_dog();
		
		
		Thread t_cat = new Thread(cat);
		// 데몬 스레드 : 일반 스레드의 작업을 돋는 보조적인 역할을 수행하는 스레드
		//			  일반 스레드가 종료되면 데몬 스레드는 강제로 종료 된다.
		t_cat.setDaemon(true);
		t_cat.start();
		
		Thread t_dog = new Thread(dog);
		t_dog.setDaemon(true);
		t_dog.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}
}
