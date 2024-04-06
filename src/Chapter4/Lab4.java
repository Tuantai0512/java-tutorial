package Chapter4;

public class Lab4 {
	public static void main(String[] args) {
		Product dau_an = new Product("Dầu ăn", 90000, 0.15);
		Product dau_nhot = new Product("Dầu nhớt", 120000, 0.2);

		System.out.println("Sản phẩm " + dau_an.getName() + " có giá là " + dau_an.getPrice());
		System.out.println("Sản phẩm " + dau_nhot.getName() + " có giá là " + dau_nhot.getPrice());

		dau_an.setName("cooking oil");
		dau_an.setPrice(100000);

		System.out.println("Sản phẩm " + dau_an.getName() + " có giá là " + dau_an.getPrice());

		System.out.println("Dầu ăn có giá thuế là: " + dau_an.getTaxPrice());
	}
}
