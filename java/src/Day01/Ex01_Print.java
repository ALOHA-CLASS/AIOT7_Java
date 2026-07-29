package Day01;


public class Ex01_Print {
    // 프로그램 실행 : ctrl + F5
    // main : ctrl + space
    // 프로그램이 시작되는 메소드
    // * 메소드의 형태
    // 접근지정자 (static) 리턴타입 메소드명 (매개변수) { 실행문; }
    public static void main(String[] args) {
        final int SPEED = 10;
        final int MAX_VALUE = 10;
        // 기본 출력 메소드
        // - print(), println() 메소드를 호출하여 출력한다.
        // - System.out 출력 객체를 사용한다.
        // sysout : ctrl + space
        System.out.print("안녕하세요");

        // println();               - ln (line)
        // : 지정한 문자열을 출력한 후, 한 줄 엔터
        System.out.println("안녕하세요 출력 후 줄바꿈");
        // 바로 엔터 : ctrl + enter
        System.out.println("자바 첫 수업");
        System.out.println();
        System.out.println("이어지는 문자열...");
    }
}
