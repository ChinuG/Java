package methodChaining;

public class ServerDBDriver {
	public static void main(String args[])
	{
		Server s1 = new Server();
		s1.name = "Apache Tomcat";
		s1.portNo = 3030;
		s1.IP = "101.2334.343";
		s1.status = "On";
		s1.getServerDetails().setDB("MySQL", "Root", "Root");
//		getDB();
	}
}
