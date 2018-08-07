package trng.samp.core1.jpaSample;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CustomerID")
	private long custId;
	@Column(name = "FirstName", nullable = false)
	private String firstName;
	@Column(name = "MiddleName")
	private String middleName;
	@Column(name = "LastName", nullable = false)
	private String lastName;
	@Column(name = "EmailID", nullable = false)
	private String emailId;
	@Column(name = "Company")
	private String company;
	@Column(name = "Address")
	private String address;
	@Column(name = "City")
	private String city;
	@Column(name = "State")
	private String state;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private List<Orders> orders;
	

	public Customers(long custId, String firstName, String middleName, String lastName, String emailId, String company,
			String address, String city, String state) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.company = company;
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public long getCustId() {
		return custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", company=" + company + ", address=" + address + ", city=" + city
				+ ", state=" + state + "]";
	}
	
	

}
