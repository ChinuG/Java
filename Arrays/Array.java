package Arrays;

public class Array {
	double []d = new double[3];
}

//	Array
//	- An array is a data Structure, which is used to store multiple data of Homogeneous type.
//	- An array is a Contiguous block of memory to store multiple data of same type.
//	Note - Arrays are predefined in size [size of an array is fixed].
//	- Arrays helps us to store and access the data using array index and array reference.
//	- Where the index starts form 0 to arraysize-1.
//	- In Java Array is an Object (it is an non-primitive data).
//	- An array is represented by ([]) and say array operator.
//	- A variable which is used to store reference of an array object is called as array reference variable.

//		- Syntax :- DataType [] variable;

//	Creating an Array Object.

//	- Syntax :- new DataType[size]
	
//	- New Operator creates an Object in Heap area and returns the reference an array Object.
//	- The DataType specifies what type of array is created.
//	- The size specifies the capacity of the array.

//	Reading or Accessing
//	-  We access(store or read) elements from an array with the help of array reference variable along with array index.

	//	- Syntax :- arrayReference[index];
//				OR
	//			  - arrayRef[index];

//	Storing elements is an array
//	- Syntax :- arrayRef[index] = value / Expression;
//	- int []i = new int[5];
//	- It will create object in heap area and stores the reference in i array variable.
//	- it will create for 5 variable in contiguous memory allocation and assign int default value. i.e. 0

// 	- ArrayIndexOutOfBound
//	- This Exception occurs when we try to access array elements with the help of which is greater array length or lesser than zero (0).

//	Note - We can fetch the length of a given array with the help of non-static variable length.

//	- Syntax :- arrayRef variable.length
//	- Example
//		for(index = 0 ; index<i.length ; index++)
//		{
//			System.out.println(i[index]);
//		}

//	Another way of creating array

//	- Syntax :- DataType [] var = {value1, value2, value3, ...};

// 	Example 
//		int [] var = {10, 20, 3, 40};

//	String example
//	- String [] str = {"Prthivi", "Onkar", "Chinu", "Athrav"};

//	- It will create an array in HEAP and stores its reference in str array variable.