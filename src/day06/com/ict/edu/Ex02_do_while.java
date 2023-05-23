package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
		/* 
		 do ~ while문 : while문과 같은 반복문
		 				단, 먼저 실행 후 조건식이 붙는다.
		 형식) 
		 		
		 		초기식;
		 		do{
		 		   실행문;
		 		   증감식;
		 		   }while(조건식);
		  */
		
		//0 - 10까지 출력
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		// 0 - 10 까지 홀수 출력
		
		// 7단 출력
		
		// 0-10 홀수의 누적합
		System.out.println("====================");
		i = 0;// 초기식
		do {
			if (i%2 == 1) { // 홀수 이면 if
				System.out.println(i);
			}
			i++;		// 증감식				
		} while (i<11); // 조건식
		System.out.println("====================");
		i = 1;
		do {              // 초기식
			System.out.println("7*" + i + "=" + (7*i));  // 실행문
			i++; // 증감식
		} while (i<10);  // 조건식
		System.out.println("====================");
		i = 0;// 초기식
		int sum = 0; 
		do {
			if (i%2 == 1) { // 홀수 이면 if
			sum += i; // 홀수 이면 sum에다 홀수를 더함 (누적합 공삭)
			}
			i++;		// 증감식				
		} while (i<11); // 조건식
		System.out.println(sum);
	}
}
