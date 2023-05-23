package day17.com.ict.edu;

import java.util.Scanner;

// throws : 예외전가, 예외양도
//			예외가 발생하면 예외처리를 해야 하지만, 현재 메서드에서는 할 수 없어서 자신을 호출한 곳으로
//			예외객체를 전달, 나중에라도 예외처리(try~catch~)를 하는 것이 좋다
public class Ex04_Exception {
	
	public void setData(String str) {
		// str 길이가 0보다 크면 ( 즉, str에 정보가 있으면)
		if(str.length()>=1) {
			// str의 첫글자를 추출하자
			String res = str.substring(0,1);
			prnData(res);
		}
	}
	public void prnData(String res) {
		try {
			int dan = Integer.parseInt(res);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		Ex04_Exception test = new Ex04_Exception();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("정수입력 : ");
		String msg = scan.next();
		test.setData(msg);
	}
}
