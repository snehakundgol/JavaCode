package com.xworkz.shop.things;

import java.util.Objects;

public class ShopDetails {

	private int shopId;
	private String name;
	private String ownerName;
	private String gstNo;
	private long mobileNo;

	
	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gstNo, mobileNo, name, ownerName, shopId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopDetails other = (ShopDetails) obj;
		return Objects.equals(gstNo, other.gstNo) && mobileNo == other.mobileNo && Objects.equals(name, other.name)
				&& Objects.equals(ownerName, other.ownerName) && shopId == other.shopId;
	}
	
	@Override
	public String toString() {
		return "ShopDetails [shopId=" + shopId + ", name=" + name + ", ownerName=" + ownerName + ", gstNo=" + gstNo
				+ ", mobileNo=" + mobileNo + "]";
	}

}
