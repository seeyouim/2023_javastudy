package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소숫점 첫째자리까지 구하기)
		int count = 0;
		int total = 0;
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
			
			System.out.print("계속할까요? (1.yes, 2.no) >> ");
			int s1 = scan.nextInt();		
			if(s1 == 2) break;
		
	}
	    double per =(count*1000/total)/10.0;
		System.out.println("전체의 횟수는 : " + total + "입니다.");
		System.out.println("짝수의 갯수는 : " + count + "입니다.");
		System.out.println("짝수가 나온 퍼센트는 : " + per + "% 입니다.");
	}

}