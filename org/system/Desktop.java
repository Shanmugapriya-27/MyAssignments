package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("13 inch");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desk1 = new Desktop();
		desk1.computerModel();
		desk1.desktopSize();
	}

}
