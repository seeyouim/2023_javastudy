package day07.com.ict.edu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);

//			원하는 회수를 입력 받고 
//			숫자를 입력 받아서 
//			입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
	    	
			System.out.print("원하는 횟수 : ");
			int su = scan.nextInt();
			String str = "";
			int num = scan.nextInt();
			for (int i = 0; i < su; i++) {
			System.out.println("숫자 입력 : ");
			
				if (num%2 == 0) {
					str = "짝수";
				}else {
					str = "홀수";
				}
				System.out.println(str);
			}
//			이름, 국어, 영어, 수학를 입력 받아서 
//			총점, 평균, 학점을 구하고 
//			이름, 총점, 평균, 학점을 출력하는 코딩 
//			(평균은 소숫점 첫째자리까지 구하자)
			 System.out.print("이름을 입력하세요: ");
		        String name = scan.next();
		        
		        // 국어, 영어, 수학 점수 입력 받기
		        System.out.print("국어 점수를 입력하세요: ");
		        int kor = scan.nextInt();

		        System.out.print("영어 점수를 입력하세요: ");
		        int eng = scan.nextInt();

		        System.out.print("수학 점수를 입력하세요: ");
		        int math = scan.nextInt();
		        
		        int sum = kor + eng + math;
		        double avg = (double)(sum/3);
		        
		        String grade;
		        if (avg>=90) {
					grade = "A학점";
				}else if (avg>=80) {
					grade = "B학점";
				}else if (avg>=70) {
					grade = "C학점";
				}else if (avg>=60) {
					grade = "D학점";
				}else {
					grade = "F학점";
				}
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("학점 : " + grade);
//			첫번째 숫자 받기
//			두번째 숫자 받기
//			연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
			System.out.print("첫번째 숫자받기: ");
			int su1 = scan.nextInt();
			System.out.print("두번째 숫자받기: ");
			int su2 = scan.nextInt();
			System.out.print("1 => + \\n 2 => - \\n 3 => * \\n 4 =>  / \\n>>>>   ");
			int m = scan.nextInt();
			int m1 = su1 + su2;
			int m2 = su1 - su2;
			int m3 = su1 * su2;
			int m4 = su1 / su2;
			int res = 0;
			if (m == 1) {
				res = m1;
			}else if (m == 2) {
				res = m2;
			}else if (m == 3) {
				res = m3;
			}else if (m == 4) {
				res = m4;
			}
		  System.out.println("연산자는 : " + res);
	}
}
