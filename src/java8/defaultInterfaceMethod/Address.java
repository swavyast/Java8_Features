package java8.defaultInterfaceMethod;

public class Address {
	String street;
	String vill;
	String city;
	String dist;
	String state;
	String country;
	int pin;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", vill=" + vill + ", city=" + city + ", dist=" + dist + ", state=" + state
				+ ", country=" + country + ", pin=" + pin + "]";
	}
}
