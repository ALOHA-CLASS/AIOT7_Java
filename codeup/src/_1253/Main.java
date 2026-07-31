package _1253;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. a, b 입력받는다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 2. a와 b의 크기를 비교한다. 
        // * 방법1
        // (a<b) -> a ~ b
        // (a>b) -> b ~ a
        // if( a < b )
        //     for (int i = a; i <= b; i++) {
        //         System.out.print(i + " ");
        //     }
        // if( a > b )
        //     for (int i = b; i <= a; i++) {
        //         System.out.print(i + " ");
        //     }
        // * 방법 2
        // (a>b) -> a와 b의 값을 바꾼다.
        if( a > b ) {
            // a와 b 교환 (swap)
            int t = a;
            a = b;
            b = t;
        }
        // 3. (a~b) 또는 (b~a)를 오름차순으로 출력한다.
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
