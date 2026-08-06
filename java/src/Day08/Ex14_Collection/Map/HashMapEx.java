package Day08.Ex14_Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	
	public static void main(String[] args) {
		// HashMap 객체 생성 하고 요소 추가하기
		Map<String, Integer> map = new HashMap<>();
		
		// 요소 추가
		map.put("원이", 22);
		map.put("리브", 19);
		map.put("미나미", 19);
		map.put("메이", 17);
		map.put("제나", 17);

		
		// 기존에 있는 key "원이"을 중복해서 추가
		// * 중복해서 key를 추가하면, 마지막에 추가한 값으로 지정된다.
		map.put("원이", 99);
		
		System.out.println("총 인원수 : " + map.size());
		System.out.println();
		
		System.out.println("미나미의 나이 : " + map.get("미나미"));
		System.out.println("원이의 나이 : " + map.get("원이"));
		
		// 요소 제거
		map.remove("메이");
		
		// Map 반복
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();

		// Map 반복 2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while( entryIterator.hasNext() ) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// Map 반복 3 - formap
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " : " + val);
		}
		System.out.println();
		
		System.out.println("총 개수 : " + map.size());
		map.clear();
		System.out.println("empty 여부 : " + map.isEmpty());
	}
}









