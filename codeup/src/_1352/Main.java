package _1352;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i : 1 2 3 4 (4번)
        for (int i = 1; i <= n; i++) {
            // j : 1 2 3 4
            for (int j = 1; j <= n; j++) {
                System.out.print("*");  // 별 n번 찍고
            }
            System.out.println();   // 엔터
        }

        sc.close();
    }
}
