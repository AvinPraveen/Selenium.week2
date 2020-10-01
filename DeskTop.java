package Week3.day2;

public class DeskTop implements Hardware, Software
{
	@Override
	public void hardwareModel() {
		System.out.println("I'm from Hardware ");
		
	}
	@Override
	public void softwareModel() {
		// TODO Auto-generated method stub
		System.out.println("i'm from Software");
	}
	public static void main(String[] args) {
		DeskTop dt=new DeskTop();
		dt.hardwareModel();
		dt.softwareModel();

	}

}
