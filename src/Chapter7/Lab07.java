package Chapter7;

public class Lab07 {
	public static void main(String[] args) {
		SinhVien it = new SinhVienIT(10, 7);
		SinhVien cokhi = new SinhVienCoKhi(9, 7);

		System.out.printf("Điểm của sinh viên IT là: %.3f \n", it.getDiem());
		System.out.printf("Điểm của sinh viên cơ khí là: %.3f", cokhi.getDiem());
	}
}
