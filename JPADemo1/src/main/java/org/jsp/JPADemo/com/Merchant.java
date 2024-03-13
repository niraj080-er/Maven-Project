package org.jsp.JPADemo.com;

import javax.persistence.*;


@Entity
	

@Table(name="Merchant")
@NamedQueries(value = {
		@NamedQuery(name="verifyMerchantByEMail", query="select m from Merchant m where m.email=?1 and m.password=?2"),
		@NamedQuery(name="findNames", query="select m.name from Merchant m")
})
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false,unique = true)
	private String gst_number;
	
	@Column(nullable = false,unique = true)
	private long phone;
	
	@Column(nullable = false,unique = true)
	private String email;
	
	@Column(nullable = false)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGst_number() {
		return gst_number;
	}

	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "id=" + id + ",\n Name=" + name + ",\n gst_number=" + gst_number + ",\n phone=" + phone + ",\n email="
				+ email + ",\n password=" + password;
	}
	
	
}