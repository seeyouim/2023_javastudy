package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Ex08_method로 만들어진 객체만 저장하는 배열 (객체형 배열 = 참조자료형 배열)
		// int[] k1 = new int[];
		Ex04_get_set[]  arr = new Ex04_get_set[3];
		
		for (int i = 0; i < arr.length; i++) {
			Ex04_get_set person = new Ex04_get_set();
			
			System.out.print("이름 : ");
			 String name = scan.next();
			person.setName(name); 
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			person.setKor(kor); 
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			person.setEng(eng); 
			
			System.out.print("수학 : ");
			 int math = scan.nextInt();
			person.setMath(math);
			
			int sum = person.getKor() + person.getEng() + person.getMath();
			person.setSum(sum);
			double avg = (int)(sum / 3.0 * 10) /10.0;
			person.setAvg(avg);
			
			if(avg >= 90) {
				person.setHak("A학점");
			}else if(avg >= 80) {
				person.setHak("A학점");
			}else if(avg >= 70) {
				person.setHak("A학점");
			}else {
				person.setHak("A학점");
			}
			
			person.setRank(1);
			
			arr[i] = person ;
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		// 정렬
		// 임시저장
		Ex04_get_set tmp = new Ex04_get_set();
		
		// 오름차순정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getRank()  >  arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp ;
				}
			}
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank());
		}
	}


	}

