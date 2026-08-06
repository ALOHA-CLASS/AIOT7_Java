package Day08.Ex15_Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Item {
	
	String code;		// 상품코드
	String name;		// 상품명
	int price;			// 가격
	
}

public class ComparatorEx2 {
	
	public static void main(String[] args) {
		List<Item> itemList = Arrays.asList(
			// TODO : 요소 추가	
		);
		
		// 정렬 전
		System.out.println("정렬 전");
		for (Item item : itemList) {
			System.out.println(item);
		}
		System.out.println();
		
		// TODO: 정렬
		// * 익명 구현 객체로 비교기준 정의
		
		
		// 정렬 후
		System.out.println("정렬 후");
		for (Item item : itemList) {
			System.out.println(item);
		}
		System.out.println();
		
	}
}












