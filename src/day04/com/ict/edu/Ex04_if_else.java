package day04.com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
		// if ~ else 문
		// 조건식이 참일 때와 거짓일 때 각각 나눠서 처리한다.
		// 형식) if(조건식){
		//			조건식이 참일 때 실행 할 문장;
		// 		}else(
		//			조건식이 거짓일 때 실행 할 문장 ;
		//			조건식이 거짓일 때 실행 할 문장 ;
 		// 		}
		
		// int k1이 60이상이면 합격 아니면 불합격
		int k1 = 80;
		String str = "";
		if (k1 >= 60) {
			str = "합격";
		} else {
			str = "불합격";
		}
		System.out.println(str);
		
		// int K2가 홀수인지 짝수인지 판별하자
		
		// char k3가 대문자인지 대문자가 아닌지 판별하자
		
		// 근무시간이 8시간까지는 시간당 9620이고 8시간을 초과한 시간 만큼은 1.5배 지급한다. 현재 근무한 시간이 10이다. 얼마를 받아야 하는가?
		
	    int k2 = 45;
	    String str2 = "";
	    if (k2 % 2 == 1) {
			str2 = "홀수";
		} else {
			str2 = "짝수";
			
		}
	    System.out.println(str2);
	    
	    char k3 = 'C';
	    String str3 = "";
	    if (k3 >= 'A' && k3 <= 'Z') {
	    	str3 = "대문자";
		} else {
			str3 = "대문자 아님";
			
		}
	    	System.out.println(str3);
	    	
	    int t = 7;
	    int d = 9620;
	    int l = 8;
	    int p = 0;
	    if (t <= 8) {
			p = t*d;
		} else {
			p = (l*d) + (int)((t-l)*d*1.5);
		}
	    	System.out.println(p);
	}
}