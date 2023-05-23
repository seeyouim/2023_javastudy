package day03.com.ict.edu;

public class Test04 {
	public static void main(String[] args) {
		// 카페모카가 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마 남는인가? (단, 부과세 10% 포함)
		
		int value = (6500*2);		
		int price = value + value*10/100;
		int money = 15000;
		int change = money - price;
		System.out.println("잔돈은 : " + change + "원");
	
	}

}
