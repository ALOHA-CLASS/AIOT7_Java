package Day06.Ex02_인자전달;

public class CallByReference {
    
    // 배열을 전달받아 배열 요소을 변경하는 메소드
    public static void setArr(int[] arr) {
        // 요소의 값을 10씩 곱해서 변경
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }
        System.out.println(":::: setArr() 메소드 ::::");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 배열을 생성하여 메소드로 전달해보기
        int arr[] = {1,2,3,4,5};

        System.out.println(":::: main() 메소드 ::::");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 참조타입 전달
        setArr( arr );

        System.out.println(":::: setArr() 메소드 호출 후 ::::");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
