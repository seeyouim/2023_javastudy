package day14.com.ict.edu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int numArr[] = new int[3]; 
		int inputArr[] = new int[3]; 
		int strike = 0; 
		int ball = 0; 
	
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 9 + 1); 
		    	for(int j = 0; j < i; j++) {
		      
		        	if(numArr[j] == numArr[i]) {
		            	
		                	i--; 
		                    	break;
		                }
		        }
		}
		for(int x : numArr) {
			
		
		
		}
		Scanner s = new Scanner(System.in);
		while(true) {
	    		
	        	for(int i  = 0; i < inputArr.length; i++) {
	            		System.out.println("1~9사이의 정수를 입력하세요 : "); 
	                    	inputArr[i] = s.nextInt();
	                        for(int j = 0; j < i; j++) {
	                        	if(inputArr[j] == inputArr[i]) {
	                            	
	                                	System.out.println("중복된 값을 입력했습니다.");
	                                    	i--;
	                                        break;
	                                }
				}
			}
	                
	                for(int i = 0; i < numArr.length; i++) {
	                	for(int j = 0; j < inputArr.length; j++) {
	                    	
	                        	if(numArr[i] == inputArr[j] && i == j) {
	                            	
	                                	strike++;
	                                 }else if(numArr[i] == inputArr[j] && i != j) {
	                                
	                                 	ball++;
					}
				}
			}

			System.out.println(strike + "스트라이크" + ball + "볼");
	        	if(strike == 3) {
	            		System.out.println("정답!");
	                    	break;
			}
	        	strike = 0;
	        	ball = 0;
			}
		}
	}

