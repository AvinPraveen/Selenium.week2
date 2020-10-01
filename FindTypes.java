package Week3.day2.String;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="$$ welcome to 2nd class of Automation $$";
		
		int letter=0,num=0,space=0,splchar=0;
		
		  char[] array = test.toCharArray();
		 		
		for (char c : array) {
			if(Character.isLetter(c))
			{
				letter++;
			}
			if(Character.isDigit(c))
    		{
    		num++;
    		}
    	if(Character.isSpaceChar(c)) 
    	{
    		space++;
    		}
    	else
    	{
    		splchar++;
    	}
		}
		System.out.println(test);
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("space: " + space);
  		System.out.println("specialCharcter: " +splchar);
    	}
	}


