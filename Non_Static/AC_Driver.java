package NonStatic_Ex_01;

public class AC_Driver {
	public static void main(String args) 
	{
		AC ac = new AC();
		ac.brand = "Blue Star";
		ac.price = 150000.55;
		ac.ton = 5;
		ac.maxTemp = 30;
		ac.minTemp = 16;
		ac.ambTemp = 20;
		
		
		ac.displayAC();
		ac.displayMaxTemp();
		
		ac.displayMinTemp();
		ac.displayAbientTemp();
		
	}
}
