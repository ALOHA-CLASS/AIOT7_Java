package Day08.Ex14_Collection.List;

import java.util.Vector;


public class VectorEx {
	
	public static void main(String[] args) {
		// Vector 생성
		// - 학생 목록
		// TODO: String 타입의 Vector 객체 students 생성하기
		
		// 요소 추가 - add()
		// TODO: 요소 5개 추가하기
		
		System.out.println("::::: 학생 목록 :::::");
		System.out.println(students);
		System.out.println("------------------");
		
		// 요소 제거 - remove()
		// TODO: 객체 요소(인스턴스)로 제거, 객체 요소(인스턴스)로 제거


		
		// 요소 접근
		String firstStudent = students.firstElement();
		String secondStudent = students.get(1);
		String lastStudent = students.getLast();
		
		System.out.println("첫 번째 학생 : " + firstStudent);
		System.out.println("두 번째 학생 : " + secondStudent);
		System.out.println("마지막 학생 : " + lastStudent);
		
		// 요소 개수 - size()
		int size = students.size();
		System.out.println("남은 학생 수 : " + size);
		
		// 모든 요소 제거 - clear()
		students.clear();
		System.out.println("::::: 모든 요소 제거 :::::");
		System.out.println(students);
		System.out.println("----------------------");
		
		// 요소 전체 추가 - addAll()
		Vector<String> 야근반 = new Vector<String>();
		야근반.add("");
		야근반.add("");
		야근반.add("");
		students.addAll(야근반);
		
		System.out.println("::::: 요소 전체 추가 :::::");
		for (int i = 0; i < students.size(); i++) {
			String student = students.get(i);
			System.out.print(student);
			if( i < students.size()-1 ) System.out.print(", ");
		}
		System.out.println();
		for (String student : 야근반) {
			System.out.print(student + " ");
		}
		System.out.println();
		
		// 다른 컬렉션을 인자로 생성할 수 있다.
		Vector<String> 오전반 = new Vector<String>(야근반);
		오전반.add("");
		for (String student : 오전반) {
			System.out.print(student + " ");
		}
		System.out.println();
	}

}




