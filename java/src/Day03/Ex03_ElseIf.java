package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("랭크 포인트(LP) : ");
        int lp = sc.nextInt();
        String tier = "";
        // 각 점수 이상일 때, 랭크 이름이 출력되도록 하시오.
        // 다중 선택 : ctrl + shift + L
        if( lp >= 3000) tier = "챌린저";
        else if( lp >= 2500 ) tier = "그랜드마스터"; 
        else if( lp >= 2000 ) tier = "마스터"; 
        else if( lp >= 1600 ) tier = "다이아"; 
        else if( lp >= 1200 ) tier = "에메랄드"; 
        else if( lp >= 900 ) tier = "플래티텀";
        else if( lp >= 600 ) tier = "골드";
        else if( lp >= 300 ) tier = "실버";
        else tier = "브론즈";
        System.out.println(tier);
        sc.close();
    }    
}
