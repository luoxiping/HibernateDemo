package com.lxp.bean;

import javax.persistence.*;

@Entity
@Table(name = "address_inf")
public class Address {
	// 消息类的标识属性
	@Id @Column(name="address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String addressDetail;
	
	public Address(){
		
	}
	
	public Address(String addressDetail){
		this.addressDetail = addressDetail;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	
	
}
