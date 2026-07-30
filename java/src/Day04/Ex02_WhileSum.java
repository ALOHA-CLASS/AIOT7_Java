package Day04;

public class Ex02_WhileSum {
    public static void main(String[] args) {
        // 1부터 100까지 합계를 구하시오.
        // 1+2+3+...+99+100 = ???
        int a = 1;
        int sum = 0;                // 합계
        while ( a <= 100 ) {
            // (최종합계) = (기존합계) + (값)
            // 방법1
            // sum = sum + a;
            // a = a + 1;

            // 방법2
            // sum = sum + a++;

            // 방법3
            sum += a++;
        }
        System.out.println("합계 : " + sum);
    }
}
