package tutorial;

import java.util.Scanner;

public class Lab2 {
	public static void Bai1() {
		System.out.println(" Bài 1: ax + b =0 ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 2 số a và b:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.printf("Giải phương trình bậc nhất: %dx + %d =0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float x = (float) -b / a;
			System.out.printf("x = %.3f", x);
		}
		scanner.close();

	}

	public static void Bai2() {
		System.out.println(" Bài 2: ax^2 + bx + c =0 ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 3 số a, b và c:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.printf("Giải phương trình bậc hai: %dx^2 + %dx + %d =0 \n", a, b, c);

		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				float x = (float) -c / b;
				System.out.printf("x = %.3f", x);
			}
		} else {
			double delta = (double) Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Nghiệm kép x = %.3f", x);
			} else {
				double x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1= %.3f \n", x1);
				System.out.printf("x2= %.3f", x2);
			}
		}
		scanner.close();

	}

	public static void Bai3() {
		System.out.println(" Bài 3: Tính tiền điện ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện:");
		int dien = scanner.nextInt();

		if (dien < 0) {
			System.out.println("Số điện ko thể âm!");
		} else if (dien >= 0 && dien <= 100) {
			int tien = dien * 1000;
			System.out.println("Tiền điện là:" + tien);
		} else {
			int tien = 100 * 1000 + (dien - 100) * 1500;
			System.out.println("Tiền điện là:" + tien);
		}
		scanner.close();
	}

	public static void Bai4() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Hãy chọn tính năng: ");
		Scanner scanner = new Scanner(System.in);
		int feature = scanner.nextInt();

		switch (feature) {
		case 1:
			Bai1();
			break;
		case 2:
			Bai2();
			break;
		case 3:
			Bai3();
			break;
		default:
			System.out.println("Kết thúc chương trình");
			System.exit(0);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Bai4();
	}
}
