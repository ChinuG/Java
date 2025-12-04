package methodChaining;

public class Server {
	String name;
	String IP;
	int portNo;
	String status;
	
	public Server getServerDetails()
	{
		System.out.println(name);
		System.out.println(IP);
		System.out.println(portNo);
		System.out.println(status);
		System.out.println(this);
		return this;
	}
	
	public DB setDB(String name, String user, String pass)
	{
		status = "ON";
		DB d1 = new DB();
		d1.name = name;
		d1.user = user;
		d1.pass = pass;
		System.out.println(this);
		return d1;
	}
}
