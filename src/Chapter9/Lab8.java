package Chapter9;

public class Lab8 {
	public static void main(String[] args) {
		Student tai = new Student("T01", "Tài oc cho", 25, 2);
		tai.setGrade();
		System.out.println("Tài đã được:" + tai.getGrade());
	}
}
