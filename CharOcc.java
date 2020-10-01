package Week3.day2.String;

public class CharOcc {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		int count = 0;
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		
		char check='e';
		
		for (int i = 0; i < length; i++) {
		
			if(charArray[i]==check)
			{
			 count++;
			}
		}
		System.out.println(count);
	}

}
