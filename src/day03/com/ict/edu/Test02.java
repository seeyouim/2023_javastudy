package day03.com.ict.edu;

public class Test02 {
	public static void main(String[] args) {
		// 2시간 40분 30초는 몇 초 일까요?
		int hour = 2*3600;
        int minute = 40*60;
        int second = 30;
		int time = hour + minute + second;
		System.out.println("2시간 40분 30초는" + time + "초입니다.");
		
		int hour2 = 2;
		int minute2 = 40;
		int second2 = 30;
		int total = hour2 * 3600 + minute2 * 60 + second2;
		System.out.println("2시간 40분 30초는"+ total + "초입니다.");
		
	}
}
