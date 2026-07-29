package Day01;

import java.util.Scanner;

public class Ex03_MBTI {
    public static void main(String[] args) {
        // Scanner 객제 생성
        Scanner sc = new Scanner(System.in);

        // 이름 입력
        System.out.print("이름 : ");
        String name = sc.nextLine();        // nextLine() : 문자열 한 줄 입력
        // 나이 입력
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();          // 남은 엔터 비우기
        // MBTI 입력
        System.out.print("MBTI : ");
        String mbti = sc.nextLine();        

        // 이름, 나이, MBTI 출력
        System.out.println("##### 학생 정보 #####");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("MBTI : " + mbti);

        sc.close();
    }
}
