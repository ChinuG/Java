package MethodChaining;

public class Pen {
	public Pen openCap()
	{
		System.out.println("Open Cap");
		return this;
	}
	
	public Pen write()
	{
		System.out.println("Writing...");
		return this;
	}
	
	public Pen closeCap()
	{
		System.out.println("Close Cap");
		return this;
	}
}
