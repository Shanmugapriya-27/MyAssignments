package Assignments.Week3;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public String Selenium() {
		return "Selenium";
	}

	public String Java() {
		return "Java 1.7v";
	}

	@Override
	public String ruby() {
		return "Programming language";
	}

	public static void main(String[] args) {
		Automation atu = new Automation();
		System.out.println(atu.Selenium());
		System.out.println(atu.Java());
		System.out.println(atu.ruby());
		atu.python();
	}

}
