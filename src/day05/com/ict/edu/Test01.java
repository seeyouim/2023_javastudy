package day05.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			int num;
			if (i % 2 == 0) {
				num = -i;
			}else {
				num = i;
			} 
				sum = num + 1;		
				
		}
			System.out.println(sum);
			System.out.println("====================");
			
		
	}
}
