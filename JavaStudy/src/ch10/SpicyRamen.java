package ch10;

public class SpicyRamen extends Ramen{
	public SpicyRamen(String name) {
		super.name = name;
	}
		@Override
		public String getTaste() {
			return name + " " +"�ſ� ����";
	}

}
