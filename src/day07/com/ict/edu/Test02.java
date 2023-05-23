package day07.com.ict.edu;

import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
		
		// 5. 6 별찍기
		// *
		// * *
		// * * *
		// * * * *

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
				if(i == j) break;
			}
			System.out.println();
		}
		System.out.println("=========================");
		for (int i1 = 1; i1 < 5; i1++) {
			for (int j2 = 4; j2 > 0; j2--) {
				if(i1 < j2)  {
					System.out.print("  ");
				}else {
					System.out.print("* ");
			}
			}
			System.out.println();
		}
	}
}
