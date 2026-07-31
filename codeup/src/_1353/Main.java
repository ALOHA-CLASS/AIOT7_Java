package _1353;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                // 각 행의 수만큼 별 출력
                System.out.print("*");
            }
            System.out.println();   // 한 줄 출력후 엔터
        }
        sc.close();
    }
}
