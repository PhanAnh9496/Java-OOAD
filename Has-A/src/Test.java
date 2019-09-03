import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static ArrayList<Address> ListAdd = new ArrayList<Address>();
	public static void menu() {
		System.out.println("1.Nhap");
		System.out.println("2.Xuat");
		System.out.println("3.Thoat");
		int chon = 0;
		System.out.println("Chon ");
		chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			System.err.println("Thoat phan mem");
			System.exit(0);
			break;
		}
		
	}
	private static void nhap() {
		Address addr = new Address();
		System.out.println("Nhap quan:" );
		String city = new Scanner(System.in).nextLine();
		System.out.println("Nhap tp");
		String state = new Scanner(System.in).nextLine();
		System.out.println("Nhap nuoc");
		String country = new Scanner(System.in).nextLine();
		
		addr.setCity(city);
		addr.setState(state);
		addr.setCountry(country);
		
		ListAdd.add(addr);
		
	}
	
	private static void xuat() {
		for (Address address : ListAdd) {
			System.out.println(address);
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

}
