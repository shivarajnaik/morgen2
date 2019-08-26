package testassignment;

import java.util.TreeMap;

public class SearchValuesInTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Character> tm = new TreeMap<Integer, Character>();
		tm.put(2, 'l');
		tm.put(7, 'k');
		tm.put(4, 'b');
		tm.put(1, 'j');
		tm.put(9, 'c');
		System.out.println(tm);
		boolean sk = tm.containsValue('b');
		System.out.println("the seacrhed values is present: "+sk);

	}

}
