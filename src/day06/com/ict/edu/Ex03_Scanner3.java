package day06.com.ict.edu;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 근무시간이 8시간까지는 시간당 9620이고 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		System.out.print("근무시간 : ");
		int w = sc.nextInt(); 
		
		int m = 9620; // 시간당
		int over = (int) (m * 1.5); // 시간당 금액
		int pay;
		if (w<=8) {
			pay = w*m;
		} else {
			pay = 8*m + (w-8) * over;
		}
		System.out.println("총급여는 " + pay + "원 입니다." );
		
		// 나라를 입력하면 수도가 출력되게 하자
		// 한국=>서울, 중국=>베이징, 일본=>도쿄 미국=>워싱턴, 이외에는 데이터 없음
		// (switch case)
		System.out.print("나라입력 : ");
		String c = sc.next();
		
		String total;
		switch (c) {
		case "한국":
			total = "서울";
			break;
		case "중국":
			total = "베이징";
			break;
		case "일본":
			total = "도쿄";
			break;
		case "미국":
			total = "워싱턴";
			break;
			

		default:
			total = "데이터없음";
			break;
		}
		System.out.println("의 수도는 " + total + "입니다.");
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
		int menu = sc.nextInt();  // 주문한 메뉴
		int m1 = 3500; // 카페모카 가격
		int m2 = 4000; // 카페라떼 가격
		int m3 = 3000; // 아메리카노 가격
		int m4 = 3500; // 과일주스 가격
		int price = 10000; // 지불한 돈
		int res = 0; // 잔돈

		if (menu == 1) {
		
			res = price - (int) (m1 * 2 * 1.1);
		} else if (menu == 2) {
			
			res = price - (int) (m2 * 2 * 1.1);
		} else if (menu == 3) {
			
			res = price - (int) (m3 * 2 * 1.1);
		} else if (menu == 4) {
			
			res = price - (int) (m4 * 2 * 1.1);
		}
		System.out.println("잔돈은 : " + res + "");
 	}
}
