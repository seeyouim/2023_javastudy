package day09.com.ict.edu;

import java.util.Arrays;

public class Ex11_Array {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
	
		
		// 		  번호,총점,평균,학점,순위
		int[]p1 = {1, 270, 90, 'A', 1};
		int[]p2 = {2, 210, 70, 'C', 1};
		int[]p3 = {3, 180, 60, 'F', 1};
		int[]p4 = {4, 300, 100, 'A', 1};
		int[]p5 = {5, 285, 95, 'A', 1};
		
	
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		
			
		
		
		for (int i = 0; i < arr.length; i++) {
			int rank = 1;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][1] < arr[j][1]) {
					rank++;
					
					 {
						
						
					}
				
							
				}
				
			}
					
				
			arr[i][4] = rank;
		
		}
		
		int[] tmp;
		for (int i = 0; i < arr[i].length-1; i++) {
			for (int j = i+1; j < arr[i].length; j++) {
				// 비교하기 ( 오름 (i>j), 내림(i<j) 때 자리 변경하자
				if(arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
		    System.out.println("번호: " + arr[i][0]);
		    System.out.println("총점: " + arr[i][1]);
		    System.out.println("평균: " + arr[i][2]);
		    System.out.println("학점: " + (char)arr[i][3]);
		    System.out.println("순위: " + arr[i][4]);
		    System.out.println();
		}
					
	}
}
