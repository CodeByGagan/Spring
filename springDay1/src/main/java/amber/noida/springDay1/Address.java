package amber.noida.springDay1;

public class Address {

	String city, state, country;
	int pincode;
	
	
	public Address() {
		super();
	}
	
	public Address(String city, String state, String country, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
}
