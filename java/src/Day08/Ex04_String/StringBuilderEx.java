package Day08.Ex04_String;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		// StringBuilder
		// : 문자열을 변경할 수 있는 클래스
		// * StringBuffer		: 멀티 스레드환경에서 동기화 O
		// * StringBuilder		: 멀티 스레드환경에서 동기화 X
		StringBuilder sb = new StringBuilder();
		
		sb.append("DW");
		sb.append("아카데미");
		System.out.println(sb);
		
		sb.insert(6, "학원");
		System.out.println(sb);
		
		sb.setCharAt(1, 'w');
		System.out.println(sb);
		
		sb.replace(0, 2, "디떠블유");
		System.out.println(sb);
		
		sb.delete(0, 8);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("글자수 : " + length);
	}

}
