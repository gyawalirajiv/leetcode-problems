package validAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("a", "b"));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s.equals(t)) return true;
		if(s.equals("") || t.equals("")) return false;
		if(s.length() != t.length()) return false;
		
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if(map1.containsKey(c)) {
				int count = map1.get(c);
				map1.put(c, count + 1);
			} else {
				map1.put(c, 1);
			}
		}
		
		for(int i = 0; i < t.length(); i++) {
			Character c = t.charAt(i);
			if(map2.containsKey(c)) {
				int count = map2.get(c);
				map2.put(c, count + 1);
			} else {
				map2.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> e: map1.entrySet()) {
			if(!map2.containsKey(e.getKey())) return false;
			int count = map2.get(e.getKey());
			if(!e.getValue().equals(count)) return false;
		}
		
		return true;
		
	}
}
