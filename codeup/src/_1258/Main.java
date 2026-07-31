package _1258;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            // sum = sum + i;
            sum += i;
            // i        수식
            // 1        1 = 0 + 1
            // 2        3 = 1 + 2
            // 3        6 = (1+2) + 3
            // ...
            // 100      ? = 1+2+...+100
        }
        System.out.println(sum);
        sc.close();
    }
}
