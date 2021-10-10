package co.skr;

public class Contact implements Comparable<Contact>{

	private long PhoneNumber;
	private String Name;
	private String Email;
	private String Gender;
	
	public Contact() {}

	public Contact(long phoneNumber, String name, String email, String gender) {
		PhoneNumber = phoneNumber;
		Name = name;
		Email = email;
		Gender = gender;
	}

	public long getPhoneNumber() {
		return PhoneNumber;
	}

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

	public String getGender() {
		return Gender;
	}

	@Override public int compareTo(Contact c) {
		int result = (int) (c.getPhoneNumber() - this.getPhoneNumber());
		return result;
	}

	@Override public String toString() {
		return "Contact [Phone Number = "+PhoneNumber+", Name = "+Name+", Email = "+Email+", Gender = "+Gender+"]";
	}
}
