package _1442;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 개수 입력
        int N = sc.nextInt();
        int[] arr = new int[N];

        // N개만큼 요소 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 선택 정렬
        // [5][2][1][4][3]
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if( arr[i] > arr[j] ) {
                    // 교환 (swap)
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
