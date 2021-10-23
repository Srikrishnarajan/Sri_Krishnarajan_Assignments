package springa1q1;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address address;
	public int getCustomerId() {
		return customerId;
	}
	/*public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}*/
	public String getCustomerName() {
		return customerName;
	}
	/*public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}*/
	public long getCustomerContact() {
		return customerContact;
	}
	/*public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}*/
	public Address getAddress() {
		return address;
	}
	/*public void setAddress(Address address) {
		this.address = address;
	}*/
	
	public Customer(int customerId, String customerName, long customerContact, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.address = address;
	}
	public void CustomerInfo() {
		System.out.println("Customer Information:\nCustomer Id: "+getCustomerId()+"\nCustomer Name: "
				+getCustomerName()+"\nCustomer Contact: "+getCustomerContact()+"\nCustomer Address: "
				+getAddress().getStreet()+","+getAddress().getCity()+","+getAddress().getState()+","
				+getAddress().getCountry()+"-"+getAddress().getZip());
	}
}
