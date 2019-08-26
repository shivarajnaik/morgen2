package testassignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.poi.hpsf.Array;

public class ShuffleElementArrayList {

	public static void main(String[] args) {
		ArrayList s1 = new ArrayList();
		s1.add("sony");
		s1.add("samsung");
		s1.add("micromax");
		s1.add("lg");
		System.out.println("Before Suffle the element:"+s1);
		Collections.shuffle(s1);
		System.out.println("After Suffle the Element:"+s1);
	}

}
