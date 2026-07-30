package Day04;

import java.util.Scanner;

public class Ex09_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 무한루프
        // : 반드시 종료조건을 추가해주어야한다.
        while (true) {
            System.out.print("입력 : ");
            String input = sc.nextLine();       // 문자열 한 줄 입력
            // 문자열.equals("비교문자열")
            // : 문자열이 비교문자열과 일치하면 true
            if( input.equals("STOP") ) {
                break;
            }
            System.out.println(">> " + input);
        }

        sc.close();
    }
}
