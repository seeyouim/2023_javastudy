package day04.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		// 근무시간이 8시간까지는 시간당 9620이고 8시간을 초과한 시간 만큼은 1.5배 지급한다. 현재 근무한 시간이 10이다. 얼마를 받아야 하는가?
		
		 int menu = 1; // 카페라떼 선택
	        int price = 0;

	        if (menu == 1) { // 카페모카 선택
	            price = 3500;
	        } else if (menu == 2) { // 카페라떼 선택
	            price = 4000;
	        } else if (menu == 3) { // 아메리카노 선택
	            price = 3000;
	        } else if (menu == 4) { // 과일쥬스 선택
	            price = 3500;
	        }

	        int total = price * 2; // 친구와 2잔을 선택
	        int tax = (int) (total * 0.1); // 부가세 10% 계산
	        int change = 10000 - (total + tax); // 잔돈 계산

	        System.out.println("잔돈은 " + change + "원 입니다.");
	
	}

}
