package Day04;

import java.util.Scanner;

public class Ex04_DoWhile {
    public static void main(String[] args) {
        // 빵지순례 리스트
        // * 변수 선언 : 메뉴번호, 빵집이름, 빵집개수
        int menuNo = 0;
        String menuName = "";
        int count = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(":::::::::: 빵집 리스트 ::::::::::");
            System.out.println("1. 성심당");
            System.out.println("2. 몽심");
            System.out.println("3. 로로네베이커리");
            System.out.println("4. 콜드베이크샵");
            System.out.println("5. 미미제과");
            System.out.println("0. 종료");
            System.out.print("빵집 번호 : ");
            // 빵집번호 입력
            menuNo = sc.nextInt();
            // break: 제어문을 탈출하는 키워드
            if( menuNo == 0 ) break;
            // 빵집 선택
            switch (menuNo) {
                case 1: menuName = "성심당"; break;
                case 2: menuName = "몽심"; break;
                case 3: menuName = "로로네베이커리"; break;
                case 4: menuName = "콜드베이크샵"; break;
                case 5: menuName = "미미제과"; break;
                default: break;
            }
            // 유효성 검사
            // - 빵집번호가 0~5번 유효
            if( menuNo >= 0 && menuNo <= 5) {
                // OOO 빵집에 갑니다!
                System.out.println(menuName + "에 갑니다!");
                count++;
            } else {
                System.out.println("(0~5)번 사이의 번호를 입력해주세요.");
            }
        } while (menuNo != 0);
        System.out.println(count + "개의 빵집을 투어하였습니다.");
        System.out.println("집에 갈래요~!");
        sc.close();
    }
}
