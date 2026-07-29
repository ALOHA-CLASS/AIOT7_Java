package Day03;

import java.util.Scanner;

public class Ex05_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영화 예매 순위(1~6) : ");
        int rank = sc.nextInt();
        String movie = "";
        
        switch (rank) {
            case 1: movie = "1. 스파이더맨"; break;
            case 2: movie = "2. 호프"; break;
            case 3: movie = "3. 군체"; break;
            case 4: movie = "4. 미니언즈"; break;
            case 5: movie = "5. 모아나"; break;
            case 6: movie = "6. 토이스토리"; break;
            default: movie = "예매 순위는 1~6까지만 있다"; break;
        }
        System.out.println(movie);
        sc.close();
    }
}
