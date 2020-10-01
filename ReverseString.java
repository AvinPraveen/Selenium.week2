package Week3.day2.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="Felling good";
		System.out.println("before reseever the string is test: "+test);
		System.out.println("resvers String");
		for (int i = test.length()-1; i >=0;i--) {
		
			System.out.print(test.charAt(i));
		}
		System.out.println("using toCharArray to reveser the string ");
				
		char[] charArray = test.toCharArray();
		for (int i = charArray.length-1; i>0; i--) {
			System.out.print(test.charAt(i));
			
		}

		
	}

}
