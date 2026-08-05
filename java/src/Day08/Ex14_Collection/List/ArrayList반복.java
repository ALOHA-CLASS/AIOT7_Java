package Day08.Ex14_Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList반복 {
	
	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		
		System.out.println("가지고 싶은 물건 5가지 입력하기");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			String product = sc.nextLine();
			cart.add(product);
		}
		
		// TODO : 반복1 - for
		
		System.out.println();
		System.out.println("-----------------------------");
		
		// TODO : 반복2 - foreach

		System.out.println();
		System.out.println("-----------------------------");
		
		// TODO : 반복3 - Iterator (for)
		// * for : ctrl + space 1번 옵션


		System.out.println();
		System.out.println("-----------------------------");
		
		// TODO : 반복4 - Iterator (while)

		System.out.println();
		System.out.println("-----------------------------");
		
		sc.close();
	}

}





