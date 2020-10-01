package Week3.day2.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		String[] comp= {"HCL","wIPRO","CTS","INFY"};
		List<String> value=new ArrayList<String>();
		for (String str : comp) {
			value.add(str);
			
		}
		System.out.println("Actual List From User");
		System.out.println(value);
		Collections.sort(value);
		System.out.println("after sort");
		System.out.println(value);
	}

}
