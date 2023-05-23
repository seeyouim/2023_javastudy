package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요를(1.yes, 2.no)일 떄 Ex01_Scanner2는 숫자로 받았는데
		// 문자가 들어오면 오류가 발생 된다.
		// 그래서 문자로 받아서 처리하자
		Scanner scan = new Scanner(System.in);
		
		// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째자리까지 구하기)
		int count = 0;
		int total = 0;
		
		esc:
		while(true) {
		System.out.print("숫자입력 : ");
		int su = scan.nextInt();
		String str = "";
		if(su%2 == 0) {
			str = "짝수";
			count++;
		}else {
			str = "홀수";
			
		}
		    total++;
			System.out.println(su + ":" + str + " 입니다.");
			
			while(true) {
			
			
			System.out.print("계속할까요? (Y(y),N(n)) >> ");
			String s1 = scan.next();		
			if(s1.equalsIgnoreCase("y")) {
				continue esc;
			}else if(s1.equalsIgnoreCase("n")) {
				break esc;
			}else {
				System.out.println("제대로 입력하세요");
				continue;
			}
		}
	
	}
	    double per =(count*1000/total)/10.0;
		System.out.println("전체의 횟수는 : " + total + "입니다.");
		System.out.println("짝수의 갯수는 : " + count + "입니다.");
		System.out.println("짝수가 나온 퍼센트는 : " + per + "% 입니다.");
	}
}
