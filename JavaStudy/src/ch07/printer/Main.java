package ch07.printer;

public class Main {
	public static void main(String[] args) {
		//static
		PC pc1 = new PC();
		pc1.request();
		
		PC pc5 = new PC();
		pc5.request();
		
		//static X memoryµî·ÏX
		Printer n = new Printer();
		
		PC pc2 = new PC();
		pc2.request2(n);
		
		PC pc3 = new PC();
		pc3.request2(n);
		
		PC pc4 = new PC();
		pc4.request2(n);
	}
}
