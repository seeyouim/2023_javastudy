package day14.com.ict.edu;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		1. 가위, 바위, 보 게임
//		2. 높음 , 낮음 맞추는 게임
//
//		- 공통사항 :  계속할까요(y/n)   사용
//		                         승률  구하기  (퍼센트) 
		
	      	            
		
		int total = 0;
        int wins = 0;
        
        String playAgain = "y";
        while (playAgain.equals("y")) {

        Scanner scanner = new Scanner(System.in);
        int comNum = (int)(Math.random()*3) + 1; 
        
        System.out.println("1.가위 2.바위 3.보");
        int myNum = scanner.nextInt();  

        System.out.print("컴퓨터가 ");
        if (comNum == 1) {
			System.out.print("가위");
		} else if(comNum == 2){
			System.out.print("바위");
		}	else{
			System.out.print("보");
		}
        System.out.println("를 냈습니다.");		



        System.out.print("사용자가 ");

        if (myNum == 1) {

        	System.out.print("가위");

        } else if (myNum == 2) {

        	System.out.print("바위");			

        } else {

        	System.out.print("보");

        }	
        System.out.println("를 냈습니다.");	
        if (comNum == myNum) {

        	System.out.println("비겼습니다.");				

        } else if ((comNum == 1 && myNum == 2) || (comNum == 2 && myNum == 3) || (comNum == 3 && myNum == 1)) {

        	System.out.println("이겼습니다.");
        	wins++;

        } else {

        	System.out.println("졌습니다.");			

        }
        total ++ ;

            System.out.print("계속해서 게임을 진행하시겠습니까? (y/n): ");
            playAgain = scanner.next();
            scanner.nextLine();
        }

        double winRate = (double) wins / total * 100;

        System.out.println("승률: " + winRate + "%");

       

        
	}
}
