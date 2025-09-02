package Strings;
// 	Converting character array into String
public class CharToString {
	public static void main(String args[])
	{
		char arr[] = {'a', 'b', 'c', 'd'};
		String s = new String(arr);
		System.out.println(s); // abcd
		System.out.println(arr); // abcd
	}
}

