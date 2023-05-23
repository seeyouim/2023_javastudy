package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// 단순 if문 : 조건식이 참일 떄만 실행, 거짓이면 if문 무시
		// 형식) if(조건식){
		//			조건식이 참일 때 실행 할 문장 ;
		//			조건식이 참일 때 실행 할 문장 ;
		//		}
		// 단, 실행문장이 한줄이면 {} 블록을 생략할 수 있다.
		
		// 형식) if(조건식) 조건식이 참일 때 실행 할 문장
		// 형식) if(조건식)
		//			조건식이 참일 때 실행 할 문장;
				
		// int k1이 60이상이면 합격
		int k1 = 55;
		String res = "초기값";
		if (k1 >= 60) {
			res = "합격";
		}
		if (k1 < 60) res = "불합격";
		System.out.println("결과 : " + res);
		
		// int k2 가 홀수인지 짝수인지 판별하자
		int k2 = 43;
		res = "짝수";
	    if (k2 % 2 == 1) {
			res = "홀수";
		}
	    System.out.println(res);
	    
	    // char k3가 대문자인지, 아닌지 판별하자
	    char k3 = 'T';
	    res = "대문자 아님";	
	    if (k3 >= 'A' && k3 <= 'Z') {
			res = "대문자";
			
		}
	    System.out.println(res);
	 // 근무시간이 8시간까지는 시간당 9620이고 8시간을 초과한 시간 만큼은 1.5배 지급한다. 현재 근무한 시간이 10이다. 얼마를 받아야 하는가?
	    int t = 10;
	    int l = 8;
	    int d = 9620;
	    int p =t*d;
	    if (t>l) {
	    	p = (l*d) + (int)((t-l)*d*1.5);
			
		}
	    System.out.println(p);
	}
}
