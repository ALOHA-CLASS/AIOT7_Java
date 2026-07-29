package Day01;

public class Ex06_ByteShort {
    public static void main(String[] args) {
        // byte : 1byte (8bit)
        // 범위 : -128 ~ 127
        byte byteValue = 100;

        // short : 2byte (16bit)
        // 범위  : -32,768 ~ 32,767
        short shortValue = 30000;

        System.out.println("### byte ###");
        System.out.println("크기 : 1byte");
        System.out.println("값 : " + byteValue);
        
        System.out.println();

        System.out.println("### short ###");
        System.out.println("크기 : 2byte");
        System.out.println("값 : " + shortValue);

        System.out.println();

        // 오버플로우
        byte overflowByte = (byte) 128;
        short overflowShort = (short) 32768;

        System.out.println("byte overflow : " + overflowByte);
        System.out.println("short overflow : " + overflowShort);

    }
}
