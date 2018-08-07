package trng.samp.core1.jpaSample;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OrderID")
	private long orderId;
	@Column(name = "CustomerID")
	private long custId;
	@Column(name = "InvoiceCreationDate")
	private Date invDate;
	@Column(name = "DeliveryDueDate")
	private Date deliveryDate;
	@Column(name = "PaymentDueDate")
	private Date paymentDate;
	@Column(name = "custommessage")
	private String customMessage;
	
	@OneToMany
	@JoinColumn(name = "orderId")
	private List<OrderItems> orderItems;

	public Orders(long orderId, long custId, Date invDate, Date deliveryDate, Date paymentDate, String customMessage) {
		super();
		this.orderId = orderId;
		this.custId = custId;
		this.invDate = invDate;
		this.deliveryDate = deliveryDate;
		this.paymentDate = paymentDate;
		this.customMessage = customMessage;
	}

	public long getOrderId() {
		return orderId;
	}

	public long getCustId() {
		return custId;
	}

	public Date getInvDate() {
		return invDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", custId=" + custId + ", invDate=" + invDate + ", deliveryDate="
				+ deliveryDate + ", paymentDate=" + paymentDate + ", customMessage=" + customMessage + "]";
	}
	
	
}
