package Assignments.Week3;

public class AxisBank extends BankInfo {
	
	public int deposit() {
		return 30000;
	}
	
	
	public static void main(String[] args) {
		AxisBank Axis = new AxisBank();
		System.out.println(Axis.deposit());
		
	}

}
