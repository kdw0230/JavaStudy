package ch10;

public class SaltyRamen extends Ramen{
	public SaltyRamen(String name) {
		 super.name = name;
		 }
	@Override
	public String getTaste() {
		return name + " " + "Â§ ¶ó¸é¸À";
}
	
}
