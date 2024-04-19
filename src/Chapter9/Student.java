package Chapter9;

public class Student extends Person {
	private int mark;
	private String grade;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public String setGrade() {
		if (this.mark >= 8) {
			return this.grade = "A";
		} else if (this.mark == 7) {
			return this.grade = "B";
		} else if (this.mark == 6) {
			return this.grade = "C";
		} else if (this.mark == 5) {
			return this.grade = "D";
		} else {
			return this.grade = "Tạch cmnr";
		}
	}

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
		this.mark = mark;
	}

}
