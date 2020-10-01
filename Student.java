package Week3.day1.college;

public class Student extends Department
{
	public void studentName() {
		System.out.println("Student Name: Praveen");

	}
	public void studentId() {
		System.out.println("71452520");

	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("BE");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentId();
		s.studentDept();

	}

}
