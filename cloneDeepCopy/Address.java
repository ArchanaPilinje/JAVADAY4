
public class Address implements Cloneable {
	
	 private String line;
	  private String city;
	  private String state;
	 private String pincode;
	 
	public Address(String line, String city, String pincode,String state) {
		
		this.line = line;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
		
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void printAdress() {
		System.out.println("The Address is:");
		System.out.println(line+"\n"+city+"\n"+pincode+"\n"+state);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}

}
