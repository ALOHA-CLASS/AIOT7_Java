package Day08.Ex14_Collection.List;

import java.util.LinkedList;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Product {
	String name;			// 상품명
	int price;				// 가격
	int count;				// 재고수
}

public class LinkedListEx {

	public static void main(String[] args) {
		// LinkedList 생성 - 상품 목록
		LinkedList<Product> products = new LinkedList<>();
		// TODO : Product 객체 3개 생성하여 추가하기

		
		
		
		// 첫 번째/마지막 요소 가져오기
		Product firstProduct = products.getFirst();
		Product lastProduct = products.getLast();
		System.out.println("첫 번째 상품 : " + firstProduct);
		System.out.println("마지막 상품 : " + lastProduct);
		
		// 첫 번째/마지막 요소 제거
		products.removeFirst();
		products.removeLast();
		
		// 첫 번째/마지막 요소 추가
		products.addFirst( new Product("모니터", 200000, 10) );
		products.addLast( new Product("컴퓨터", 1500000, 5) );
		System.out.println(products);
		
		System.out.println("상품 개수 : " + products.size());
		
		products.clear();
		System.out.println("::::: 상품 목록 :::::");
		System.out.println(products);
		
	}
}







