package ch08;

public class Shop {
	String shopName;
	String telNum;
	boolean hasParking;

	// �⺻ ������ �ۼ�
	public Shop() {
	}
	// �Ű����� 3�� ������ �ۼ�

	public Shop(String shopName, String telNum, boolean hasParking) {
		super();
		this.shopName = shopName;
		this.telNum = telNum;
		this.hasParking = hasParking;
	}

	// shopName, telNum, hasParking �� getter / setter �޼ҵ� �ۼ�
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public boolean isHasParking() {
		return hasParking;
	}

	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}


}
