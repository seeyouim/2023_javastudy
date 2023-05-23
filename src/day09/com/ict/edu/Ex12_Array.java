package day09.com.ict.edu;

import java.util.Iterator;
import java.util.Scanner;

public class Ex12_Array {
	public static void main(String[] args) {
		
				// 키보드로 학생 수 받기
				// 키보드로 번호,국어,영어,수학 입력받기
				// 총점, 평점 ,학점 구하기, 순위 (초기값 설정)
				// 순위구하기
				// 순위기준 오름차순 정렬 
				// 출력
		Scanner scan = new Scanner(System.in);	
		System.out.print("학급 인원수 :  ");  // 키보드로 학생 수 받기
		int nums = scan.nextInt();
		int[][] students = new int[nums][8];
		 
		int[][] id = new int[nums][8];
		int[][] kor = new int[nums][8];
		int[][] eng = new int[nums][8];
		int[][] math = new int[nums][8];
		int[][] sum = new int[nums][8];
	    double[][] avg  = new double[nums][8];
	    String[][] grade = new String[nums][8];
	    
	    for (int i = 0; i < nums; i++) {
			System.out.print("번호를 입력하세요 : ");
			id[i][0] = scan.nextInt();
			System.out.print("국어 점수를 입력하세요 : ");
			kor[i][1] = scan.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			eng[i][2] = scan.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			math[i][3] = scan.nextInt();
			
					sum[i][4] = kor[i][1] + eng[i][2] + math[i][3];
					avg[i][5] = (int)(sum[i][4]/3.0*10)/10.0;
	    }
	    for (int i = 0; i < nums; i++) {
			if (avg[i][5] >= 90) {
				grade[i][6] = "A학점";
			} else if(avg[i][5] >= 80){
				grade[i][6] = "B학점";
			} else if(avg[i][5] >= 70){
				grade[i][6] = "C학점";
			} else {
				grade[i][6] = "F학점";
			}
		}
	    int[][] rank = new int[nums][8];  
        for (int i = 0; i < nums; i++) {
            rank[i][7] = 1;
            for (int j = 0; j < nums; j++) {
            	if (i == j) continue;
                if (sum[i][4] < sum [j][4]) {
                    rank[i][7]++;
				}
                
			}

    		
    				}
    				int[] tmp;
    	    		for (int i = 0; i < nums-1; i++) {
    	    			for (int j = i+1; j <nums; j++) {
    	    				// 비교하기 ( 오름 (i>j), 내림(i<j) 때 자리 변경하자
    	    				if(sum[i][4] > sum[j][4]) {
    	    					tmp = sum[i];
    	    					sum[i] = sum[j];
    	    					sum[j] = tmp;
	}
    		}
			
}
				System.out.println("번호\t총점\t평균\t학점\t순위");
				for (int i = 0; i < nums; i++) {
					System.out.print(id[i][0] + "\t");
					System.out.print(sum[i][4] + "\t");
					System.out.print(avg[i][5] + "\t");
					System.out.print(grade[i][6] + "\t");
					System.out.println(rank[i][7] + "\t" );
}
}
}