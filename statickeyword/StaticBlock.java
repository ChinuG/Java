package statickeyword;
// 	- Static block doesn't have any name
//	- It doesn't have any return type
// 	- No Access Modifier
// 	- Doesn't have formal arguemtns
// 	- Therefore
// 	- A programmer cannot explicitely call a static block for execution

public class StaticBlock {

	static {
		System.out.println("Hello World!");
	}

	public static void main(String args[]) {

	}
}

// WHy we need main method to run static block
// ---> - When you run a Java program from command line (java StaticBlock),
// JVM looks for the main method because that’s the program’s entry point.
// - While preparing to run main, JVM first loads the class, and at that moment,
// the static block executes.
// - Without main, the program has no "entry point". The JVM won’t know what to
// do after running the static block, so we get an error.

