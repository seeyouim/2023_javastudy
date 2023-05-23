package day03.com.ict.edu;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇시간, 몇분, 몇초 인가?
		int total = 3989;
		int hours = total/(60*60);
		int minute = total/60 - (hours*60);
		int second = total%60;
		
		System.out.println(total + "초는" + hours + "시간" + minute + "분" + second + "초입니다.");
		
		
		int hours2 = total / 3600;
		int minute2 = total % 3600 / 60;
		int second2 = total % 3600 % 60;
		
		System.out.println(total + "초는" + hours2 + "시간" + minute2 + "분" + second2 + "초입니다.");
	}

}
