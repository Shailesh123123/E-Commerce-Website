package neu.edu.entity;
// Generated Dec 15, 2016 5:29:54 AM by Hibernate Tools 5.1.0.Alpha1

/**
 * OrderTable generated by hbm2java
 */
public class OrderTable implements java.io.Serializable {

	private int orderId;
	private String status;
	private Integer sellerId;
	private Integer customerId;

	public OrderTable() {
	}

	public OrderTable(int orderId) {
		this.orderId = orderId;
	}

	public OrderTable(int orderId, String status, Integer sellerId, Integer customerId) {
		this.orderId = orderId;
		this.status = status;
		this.sellerId = sellerId;
		this.customerId = customerId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

}