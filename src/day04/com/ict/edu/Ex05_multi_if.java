package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		// 조건식1이 참일 때 실행 할 문장;
		// 조건식1이 참일 때 실행 할 문장;
		// }else if(조건식2){
		// 조건식1이 거짓이면서 조건식2가 참일 때 실행 할 문장;
		// 조건식1이 거짓이면서 조건식2가 참일 때 실행 할 문장;
		// }else if(조건식3){
		// 조건식1,2는 거짓이면서 조건식3가 참일 때 실행 할 문장;
		// 조건식1,2는 거짓이면서 조건식3가 참일 때 실행 할 문장;
		// }else{
		// 조건1,2,3 모두 거짓인 경우
		// }

		// int k1의 점수가 90이상이면 A학점, 80이상이면 B학점 70이상이면 C학점, 나머지 F 학점

		// char k2가 대문자인지, 소문자인지. 슷자인지, 기타문자인지 판별하자

		// char k3의 A,a 이면 아프리카, B,b 이면 브라질 C,c이면 캐나다 나머지는 한국

		int k1 = 100;
		String str = "";
		if (k1 >= 90) {
			str = "A학점";
		} else if (k1 >= 80) {
			str = "B학점";
		} else if (k1 >= 70) {
			str = "C학점";
		} else {
			str = "F학점";
		}
		System.out.println(str);

		char k2 = '0';
		String str2 = "";
		if (k2 >= 'A' && k2 <= 'Z') {
			str2 = "대문자";
		} else if (k2 >= 'a' && k2 <= 'b') {
			str2 = "소문자";
		} else if (k2 >= '0' && k2 <= '9') {
			str2 = "숫자";
		} else {
			str2 = "기타문자";
		}
		System.out.println(str2);

		char k3 = 'A';
		String str3 = "";
		if (k3 == 'A' || k3 == 'a') {
			str3 = "아프리카";
		} else if (k3 == 'B' || k3 == 'b') {
			str3 = "브라질";
		} else if (k3 == 'C' || k3 == 'c') {
			str3 = "캐나다";
		} else {
			str3 = "한국";
		}
		System.out.println(str3);

		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능

		int menu = 3; // 주문한 메뉴
		int m1 = 3500; // 카페모카 가격
		int m2 = 4000; // 카페라떼 가격
		int m3 = 3000; // 아메리카노 가격
		int m4 = 3500; // 과일주스 가격
		int price = 10000; // 가격
		double tax = 1.1; // 부가세
		int result = 0; // 잔돈
		
		if (menu == 1) {
		
			result = price - (int) (m1 * 2 * tax);
		} else if (menu == 2) {
			
			result = price - (int) (m2 * 2 * tax);
		} else if (menu == 3) {
			
			result = price - (int) (m3 * 2 * tax);
		} else if (menu == 4) {
			
			result = price - (int) (m4 * 2 * tax);
		}
		System.out.println("잔돈은" + result + "원입니다.");
	} 
}
