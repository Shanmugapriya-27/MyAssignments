package Assignments.Week3;

public class Students {
	
	public void getStudentInfo(int Id) {
			System.out.println(Id);
	}
	
	public void getStudentInfo(int Id, String Name) {
		System.out.println(Id);
		System.out.println(Name);
	}
	
	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stu = new Students();
		stu.getStudentInfo(27);
		stu.getStudentInfo(27, "Priya");
		stu.getStudentInfo("shan@gmail.com","9363449940" );
	}

}
