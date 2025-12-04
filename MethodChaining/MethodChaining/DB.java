package methodChaining;

public class DB {
	String name;
	String user;
	String pass;
	
	public DB getDB()
	{
		System.out.println(name);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(this);
		return this;
	}
}
