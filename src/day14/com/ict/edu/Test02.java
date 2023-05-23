package day14.com.ict.edu;
import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main (String[] args) {

        int i=0;
        int num;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(100);

        do {
            System.out.println("숫자를 입력하세요 : ");
            num = scan.nextInt();

            if (x>num) { System.out.println("UP"); }
            else if (x<num) { System.out.println("DOWN"); }
            i++;
        }               
        while (x!=num);
        System.out.println("정답입니다! "+i+"회 만에 맞췄습니다.");
        
    }
}


