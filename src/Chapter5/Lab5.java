package Chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.print("Hãy nhập 1 danh sách số thực:");

		while (true) {
			double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();
			System.out.println("Continue ? (Y/N)");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				// why using equals ?
				System.out.println("Danh sách số vừa nhập là: " + list);
				double sum = 0;
				for (int i = 0; i < list.size(); i++) {
					sum += list.get(i);
				}
				System.out.println("Tổng của danh sách là :" + sum);
				break;
			}
		}

		scanner.close();
	}
}
