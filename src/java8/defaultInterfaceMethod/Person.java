package java8.defaultInterfaceMethod;

public class Person extends Address {
		String fname;
		String mname;
		String lname;
		Address ad;
		long phone;
		long aadhaar;
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public Address getAd() {
			return ad;
		}
		public void setAd(Address ad) {
			this.ad = ad;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public long getAadhaar() {
			return aadhaar;
		}
		public void setAadhaar(long aadhaar) {
			this.aadhaar = aadhaar;
		}
		@Override
		public String toString() {
			return "Person [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", ad=" + ad + ", phone="
					+ phone + ", aadhaar=" + aadhaar + "]";
		}
}
