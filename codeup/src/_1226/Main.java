package _1226;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 13 23 24 35 40 45 7
        // 2 6 7 23 40 44
        Scanner sc = new Scanner(System.in);
        int lotto[] = new int[7];
        int my[] = new int[6];

        // 당첨 번호 7개 입력
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = sc.nextInt();
        }
        // 선택 번호 6개 입력
        for (int i = 0; i < my.length; i++) {
            my[i] = sc.nextInt();
        }

        int count = 0;      // 일치하는 번호 개수
        // 번호 비교
        for (int i = 0; i < my.length; i++) {
            for (int j = 0; j < my.length; j++) {
                // 당첨번호와 내가 선택한 번호가 일치할 때
                if( lotto[i] == my[j] ) {
                    count++;
                }
            }
        }

        // 등수 확인하기
        int rank = 0;
        switch (count) {
            case 6: rank = 1; break;
            case 5: 
                rank = 3; 
                // 보너스 번호 확인
                for (int i = 0; i < my.length; i++) {
                    if( my[i] == lotto[6] ) {
                        rank = 2;
                        break;
                    }
                }
                break;
            case 4: rank = 4; break;
            case 3: rank = 5; break;
        }
        System.out.println(rank);
        sc.close();
    }
}
