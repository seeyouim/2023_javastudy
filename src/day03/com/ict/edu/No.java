package day03.com.ict.edu;

public class No {
	public static void main(String[] args) {
		        // 이름이 홍길동인 사람의 점수가
				// 국어 90, 영어 80, 수학 80 점이다.
				// 총점과 평균을 구하자
				// 화면 출력은 이름, 총점, 평균만 출력하자
				// 단, 평균은 소수점 첫째짜리까지 구하자
		String name = "홍길동";
		System.out.println("이름은 : " + name + "입니다.");
		
		int kor = 99;
		int eng = 84;
		int math = 82;
		int sum = kor + eng + math;
		System.out.println("총점은 : " + sum + "입니다.");
		
		double avg = (double)sum/3;
		double avg2 = (int)(avg*10)/10.0;
		System.out.println("평균은 : " + avg2 + "입니다.");
		
		// 2시간 40분 30초는 몇 초 일까요?
		int h = 2;
		int m = 40;
		int s = 30;
		int total = h*3600 + m*60 + s;
		System.out.println("2시간 40분 30초는 " + total + "초입니다.");
		
		// 3989초는 몇시간, 몇분, 몇초 인가?
		int t = 3989;
		int h2 = t/3600;
		int m2 = t/60 - h2*60;
		int s2 = t%60;
		System.out.println("3989초는 " + h2 + "시간" + m2 + "분" + s2 + "초입니다.");
	
		// 카페모카가 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마 남는인가? (단, 부과세 10% 포함)
		
		int v = 6500*2;
		int p = v + v*10/100;
		int mo = 15000;
		int c = mo - p;
		System.out.println("잔돈은 " + c + "원입니다.");
		
		int su = 5946;
		
		// 결과 :
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		int su1 = su/1000;
		int su2 = (su%1000)/100;
		int su3 = (su%100)/10;
		int su4 = (su%10)/1;
		System.out.println("천의자리 :" + su1);
		System.out.println("백의자리 :" + su2);
		System.out.println("십의자리 :" + su3);
		System.out.println("일의자리 :" + su4);
	}

}
