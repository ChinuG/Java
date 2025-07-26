public class LocalFinalVar
{
	public static void main(String args[])
	{
		final int a;
		a = 10;
		System.out.println(a); //100
		a = 1000;
	}
}

// Final
//	- Final is a kwyword and a modifier.
//	- Members prefix with final modifier are known as final members.
// 	- We can prefix final medifier to a class, method, and variable.

// Final Variable
// 	- A ocal final variable can be declare without initialization.
// 	- But to use the variable it has to be initialize wihtin same block.