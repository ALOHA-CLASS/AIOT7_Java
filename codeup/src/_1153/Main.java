package _1153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a 와 b 입력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a > b ) System.out.println(">");
        else if( a < b ) System.out.println("<");
        else System.out.println("=");
        sc.close();
    }
}
