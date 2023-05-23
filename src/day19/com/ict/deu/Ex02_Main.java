package day19.com.ict.deu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println(" main : " + Thread.currentThread().getName());
		
		Ex02_dog dog = new Ex02_dog();
		Ex02_cat cat = new Ex02_cat();
		
		// 멀티스레드 : 여러개의 스레드를 만들어서 병렬처리
		// 스레드 만드는 방법 : start()를 호출해서 run()로 가면 스레드 생성 (일꾼 생성)
		dog.start();
		cat.start();
		System.out.println(" main : " + Thread.currentThread().getName());
	}
}
