package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학급 인원수 :  ");
		int count = scan.nextInt();

	        String[] name = new String[count];  
	        int[] kor = new int[count]; 
	        int[] eng = new int[count];
	        int[] math =  new int[count];
	        int[] sum = new int[count];
	        double[] avg  = new double[count];
	        String[] grade = new String[count];
	    
	        
	        for (int i = 0; i < count; i++) {
				System.out.print("이름을 입력하세요 : ");
				name[i] = scan.next();
				System.out.print("국어 점수를 입력하세요 : ");
				kor[i] = scan.nextInt();
				System.out.print("영어 점수를 입력하세요 : ");
				eng[i] = scan.nextInt();
				System.out.print("수학 점수를 입력하세요 : ");
				math[i] = scan.nextInt();
				
						sum[i] = kor[i] + eng[i] + math[i];
						avg[i] = (int)(sum[i]/3.0*10)/10.0;
			}	        
	        
	        for (int i = 0; i < count; i++) {
				if (avg[i] >= 90) {
					grade[i] = "A학점";
				} else if(avg[i] >= 80){
					grade[i] = "B학점";
				} else if(avg[i] >= 70){
					grade[i] = "C학점";
				} else {
					grade[i] = "F학점";
				}
			}
	        
	        int[] rank = new int[count];  
	        for (int i = 0; i < count; i++) {
	            rank[i] = 1;
	            for (int j = 0; j < count; j++) {
	            	if (i == j) continue;
	                if (sum[i] < sum [j]) {
	                    rank[i]++;
					}
				}
	            
				
			}
				System.out.println("이름\t총점\t평균\t학점\t순위");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					System.out.print(sum[i] + "\t");
					System.out.print(avg[i] + "\t");
					System.out.print(grade[i] + "\t");
					System.out.println(rank[i] + "\t" );
					
					
	}
}
}
