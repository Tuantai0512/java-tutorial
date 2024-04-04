package tutorial;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Điểm trung bình: ");
		Float score = scanner.nextFloat();
		System.out.println(name + " có điểm = " + score);
	}
}
