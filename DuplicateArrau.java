package Week3.day2.Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrau {
	public static void main(String[] args) {
		List<String> value=new ArrayList<String>();
		value.add("TCS");
		value.add("Wipro");
		value.add("Infy");
		value.add("FIS");
		value.add("TCS");
		value.add("Wipro");
		
		for (String str : value) {
			System.out.println(str);
		}
	Set<String> st=new LinkedHashSet<String>(value);
	
		System.out.println(st);

		
	}

}
