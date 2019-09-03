package phananh.com.vn;

public class Guitar {
	private String serialNumber;
	private String price;
	private GuitarSpec guitarSpec;
	
	public Guitar(String serialNumber, String price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
	
	
	
}