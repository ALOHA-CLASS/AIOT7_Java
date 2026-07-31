package Day05;

public class Ex01_String {

    public static void main(String[] args) {
        // String 은 참조 자료형
        // - 문자열 한 글자씩 그 자체를 비교할 때는 equals() 를 사용

        // * 문자열 사용방법
        // 1. 문자열 리터럴("") 로 지정
        // 2. 문자열 객체 생성

        // 문자열 리터럴
        String a = "Hello"; // 100번지
        String b = "Java";  // 200번지
        String c = "Hello"; // 100번지

        // 문자열 객체 생성
        String d = new String("Hello"); // 300번지
        String e = new String("Java");  // 400번지
        String f = new String("Java");  // 500번지

        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("문자열 비교 : " + a.equals(d));

        System.out.println("e == f : " + (e == f));
        System.out.println("문자열 비교 : " + e.equals(f));
    }
}
