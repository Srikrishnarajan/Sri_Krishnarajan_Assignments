package co.skr;

public class Orders {
	private int orderPrice;
	private String orderStatus;
	
	public Orders() {}

	public Orders(int price, String status) {
		this.orderPrice = price;
		this.orderStatus = status;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	@Override public String toString() {
		return "Your Orders [Price = "+orderPrice+", Status = "+orderStatus+"]";
	}
}
