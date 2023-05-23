package day06.com.ict.edu;

import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
		// 1. if~ else문
		// 농구공 5개씩 한 박스에 들어간다.
		// 40개면 8상자, 26개면 6개이다.
		// int k1 = 127개이다.
		// 몇 상자가 필요한가요?
		int k1 = 127;
		int in = 5;
		int box;
		if (k1 >= 40 * in) {
			box = k1 / in / 8;
		} else if (k1 >= 40 * in) {
			box = k1 / in / 6;
		} else {
			box = k1 / in;
		}
		System.out.println("상자의 갯수는 = " + box);
		// 2. for 문으로 플기
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0" + " ");
			}
			System.out.println(" ");
		}
		System.out.println("=========================");
		// 3. 이중 for 문으로 풀기
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					System.out.print("1" + " " );
				} else {
					System.out.print("0" + " " );
				}

			}
			System.out.println(" ");
		}
		System.out.println("=========================");
		// 4. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
		int sum = 0;
		int i = 1;
		while (sum < 100) {
		    int num = i;
		    if (i % 2 == 0) {
		        num *= -1;
		    }
		    sum += num;
		    i++;
		}
		System.out.println(i-1);

		// 5. 6 별찍기
		// *
		// * *
		// * * *
		// * * * *

		//       *
		//     * *
		//   * * *
		// * * * *
		System.out.println("=========================");
		int n = 4; // 삼각형의 높이
		for (int i1 = 0; i1 < n; i1++) {
		    for (int j = 0; j <= i1; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		System.out.println("=========================");
		int n2 = 4; // 삼각형의 높이
		for (int i2 = 0; i2 < n2; i2++) {
			
		    for (int j1 = n2-1; j1 > i2; j1--) {
		        System.out.print("  ");
		    }
		    for (int j1 = 0; j1 <= i2; j1++) {
		    	System.out.print("* ");
		}
		  System.out.println();
	}
}
}