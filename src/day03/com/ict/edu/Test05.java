package day03.com.ict.edu;

public class Test05 {
	public static void main(String[] args) {
		int su = 7368;
		
		// 결과 :
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		int su2 = su/1000;
		System.out.println("천의자리 : " + su2);
		int su3 = (su%1000)/100;
		System.out.println("백의자리 : " + su3);
		int su4 = (su%100)/10;
		System.out.println("십의자리 : " + su4);
		int su5 = (su%10)/1;
		System.out.println("일의자리 : " + su5);
		
		
  }
}