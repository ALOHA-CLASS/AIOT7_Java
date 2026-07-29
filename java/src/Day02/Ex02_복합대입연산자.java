package Day02;

public class Ex02_복합대입연산자 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("num : " + num);
        
        num += 5;
        System.out.println("num += 5 : " + num);

        num -= 3;
        System.out.println("num -= 3 : " + num);

        num *= 2;
        System.out.println("num *= 2 : " + num);

        num /= 4;
        System.out.println("num /= 4 : " + num);

        num %= 3;
        System.out.println("num %= 3 : " + num);

    }
}
