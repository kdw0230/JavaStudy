package ch08;

import java.awt.Color;

public class Bike {
	int cc; // ��ⷮ
	Color color; // ����
	String company; // ������

	// �⺻ ������ �ۼ�
	public Bike() {
		
	}
	// �Ű����� 2�� ������ �ۼ� (��ⷮ, ������)
	public Bike(int cc, String company) {
		this.cc = cc;
		this.company = company;
		//this(cc, Color.red, company);
	}
	// �Ű����� 3�� ������ �ۼ�
	public Bike(int cc, Color color, String company) {
		this.cc = cc;
		this.color = color;
		this.company = company;
	}
	// cc, color, company �� getter / setter �޼ҵ� �ۼ�
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
