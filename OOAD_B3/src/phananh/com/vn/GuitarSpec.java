package phananh.com.vn;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood topWood;
	private Wood backWood;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}
	
	public Type getType() {
		return type;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
}
