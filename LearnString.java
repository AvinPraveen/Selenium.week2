package Week3.day2.String;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="good";
		String s3="Hello";
		System.out.println(s1+"\n"+s2+"\n"+s3);
		System.out.println();
		System.out.println("== if memory address equal it will return ture else false");
		System.out.println((s1==s3));
		System.out.println(s1==s2);
		System.out.println("i want to compare the value of two string");
		System.out.println("equals() is the to compare the value ");
		System.out.println(s1.equals(s3));
		System.out.println("value is not equal so return false");
		System.out.println(s1.equals(s2));
		
		String st1="Hello";
		String st2="hello";
		System.out.println("st1 and st2 are different H and h");
		System.out.println("both == and equals() return false because case sensitive");
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		
		System.out.println("to avoid this we have a method call equalsIgnoreCase()");
		System.out.println(st1.equalsIgnoreCase(st2));
		System.out.println("to check the how many char there in string then the method call Length()");
		System.out.println(st1.length());
		System.out.println("if we want to get the character of any index value then the method is charAt(index)");
		System.out.println(st1.charAt(1));
		System.out.println("last character");
		System.out.println(st1.charAt(st1.length()-1));
		System.out.println("if i want to string into char H E L L O ");
		for (int i = 0; i < st1.length(); i++) 
		{
			System.out.println(st1.charAt(i));
					
		}
		System.out.println("to print in reversed order");
		for (int i = st1.length()-1; i >=0;i--) {
			System.out.print(st1.charAt(i));
			
		}
		System.out.println();
		
			System.out.println("convert the string into array the method toCharArray");
			
			  char[] charArray = st1.toCharArray();
			  int l = charArray.length; 
			  for (int i =l-1; i >=0; i--) 
			  {
				  System.out.print(st1.charAt(i));
			  
			  }
			 String str="welcome to java session in to  online class";
			 String[] splitword = str.split(" ");
		
				  System.out.println(splitword); 
				  for (String eachword : splitword) {
				  System.out.println(eachword);  }
				  
				System.out.println(str.replace('j', 'v'));
				System.out.println(str.replaceAll("java", "dotnet"));
				System.out.println(str.substring(3));
				 
			 
	}

}
