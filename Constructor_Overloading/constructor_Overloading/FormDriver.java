package constructor_Overloading;

public class FormDriver 
{
	public static void main(String args[])
	{
		Form f1 = new Form();
		f1.displayForm();
		
		
		Form f2 = new Form("Raju", 20, 9876543210l, "raju@gmail.com", "Dholakpur");
		f2.displayForm();
		
		Form f3 = new Form("Rani", 22, 8765432109l, "rani@gmail.com", "Pune", "B+", 9876543412l);
		f3.displayForm();
	}
}
