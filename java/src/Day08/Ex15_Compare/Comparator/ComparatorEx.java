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
class Product implements Comparator<Product> {
	
	String code;		// 상품코드
	String name;		// 상품명
	int price;			// 가격
	
	
	@Override
	public int compare(Product o1, Product o2) {
		// 1. 가격순으로 내림차순
		// 2. 이름순으로 오름차순
		int price1 = o1.getPrice();
		int price2 = o2.getPrice();
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		// TODO : 방법 1
		
		// TODO : 방법 2
		
	}
	
}

public class ComparatorEx {
	
	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(
			// TODO : 요소 추가
		);
		
		// 정렬 전
		System.out.println("정렬 전");
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println();
		
		// TODO : 정렬
		
		// 정렬 후
		System.out.println("정렬 후");
		for (Product product : productList) {
			System.out.println(product);
		}
		System.out.println();
		
	}
}












