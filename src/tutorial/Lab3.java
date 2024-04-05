package tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
	private static void Bai1() {
		System.out.println("Bài 1: Check số nguyên tố: ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập 1 số nguyên lớn hơn 0:");
		int number = scanner.nextInt();
		scanner.close();

		if (number <= 0) {
			System.out.println("Hãy nhập số lớn hơn 0");
		} else {
			for (int i = 2; i < number - 1; i++) {
				if (number % i == 0) {
					System.out.println("Số này không phải số nguyên tố!");
					return;
				}
			}
			System.out.println("Số này là số nguyên tố!");
		}

	}

	private static void Bai2() {
		System.out.println("Bài 2: Xuất bảng cửu chương");
		System.out.println("Hãy nhập 1 số bất kỳ");
		Scanner scanner = new Scanner(System.in);
		int number2 = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", number2, i, number2 * i);
		}
		scanner.close();
	}

	private static void Bai3() {
		System.out.println("Bài 3: Nhập mảng");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phần tử mảng: ");
		int arr_length = scanner.nextInt();

		int[] array = new int[arr_length];
		System.out.println("Nhập phần tử mảng: ");
		for (int i = 0; i < arr_length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Mảng vừa nhập là: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Phần tử có giá trị nhỏ nhất là: " + array[0]);
		System.out.println("Phần tử có giá trị lớn nhất là: " + array[array.length - 1]);
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Bài 1: Check số nguyên tố |");
		System.out.println("| 2. Bài 2: Xuất bảng cửu chương|");
		System.out.println("| 3. Bài 3: Nhập mảng|");
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
}
