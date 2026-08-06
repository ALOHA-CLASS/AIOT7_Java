package _1443;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 삽입 정렬
        int i, j, key;

        // 두 번째 요소부터 정렬 시작
        for (i = 1; i < N; i++) {
            // 현재 삽입할 값을 key에 저장
            key = arr[i];
            // 앞의 요소 : j
            for( j = i - 1; j >= 0 && arr[j] > key  ; j-- ) {
                arr[j + 1] = arr[j];
            }
            // 비어 있는 위치에 key 삽입
            arr[j + 1] = key;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
        sc.close();
    }
}
