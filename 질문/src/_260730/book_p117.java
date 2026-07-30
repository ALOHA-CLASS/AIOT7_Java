package _260730;

import java.util.Scanner;

public class book_p117 {
    public static void main(String[] args) {
        // 입력 객체는 한개로 해도 괜찮다!
        // Scanner s1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 : ");
        int n = sc.nextInt();

        System.out.print("숫자2 : ");
        int m = sc.nextInt();

        int sum = n + m;
        double avg = (double) sum / 2.0;

        System.out.println("합계 : " + sum);
        // 방법1
        // System.out.println("평균 : " + (n+m)/2.0);
        // 방법2
        System.out.println("평균 : " + avg);

        // 보너스
        // %f 로 실수형식을 표기
        System.out.printf("평균 : %.2f", avg);
        sc.close();
    }
}
