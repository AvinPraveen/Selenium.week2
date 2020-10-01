package Week3.day2;

public class College extends University {
	@Override
	//asbtract method can override non asbtract method can't override
	public void ug() {
	System.out.println("my ug is Computer science");
		
	}

	public static void main(String[] args) {
		College cg=new College();
		cg.ug();
		cg.pg();

	}

}
