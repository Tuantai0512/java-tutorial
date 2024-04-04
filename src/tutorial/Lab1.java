package tutorial;

import java.util.Scanner;

public class Lab1 {
	public static void Bai1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bài 1:");
		System.out.println("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.println("Điểm trung bình: ");
		Float score = scanner.nextFloat();
		System.out.println(name + " có điểm = " + score);
	}

	public static void Bai2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bài 2: ");
		System.out.println("Nhập chiều dài 2 cạnh của hình chữ nhật: ");
		int dai = scanner.nextInt();
		int rong = scanner.nextInt();
		System.out.println("Chu vi: " + (dai + rong) * 2);
		System.out.println("Dien tich: " + dai * rong);
		System.out.println("Cạnh nhỏ nhất: " + Math.min(dai, rong));
	}

	public static void Bai3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bài 3: ");
		System.out.println("Nhập chiều dài cạnh của hình lập phương: ");
		int canh = scanner.nextInt();
		System.out.println("Chu vi: " + Math.pow(canh, 3));
	}

	public static void main(String[] args) {
		Bai1();
		Bai2();
		Bai3();
	}
}
