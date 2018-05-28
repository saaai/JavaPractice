
import java.io.*;
//import java.io.IntputStreamReader;
//import java.io.BufferedReader;

class BasicCalc
{
	public static void main(String args[]) throws IOException
	{
		try {


		//IntputStream in = System.in;//capturing the inputstreamand storing it in "in"
		InputStreamReader isr = new InputStreamReader(System.in);//isr is a input stream object creation
		//passing "in" inputstreamreader constructor
		//instead of giving "in" inside the constructor we can directly give System.in
		//IntpurStreamReader isr = new IntpurStreamReader(System.in); instead of storing System.in in "in"
		BufferedReader reader = new BufferedReader(isr);///we creatde the buffered reader object and trying to pass the isr object
		//passing the inputstreamreader(isr) object created above
		System.out.println("please enter a value:");
		String msg = reader.readLine();
		//by using the bufferreader object call the readline method, now caputre the data in the "msg" variable
		System.out.println(msg);

		//a basic calculator for division with the input
		System.out.println("please enter a value:");
		String input = reader.readLine();//we are entering a string here 
		int a = Integer.parseInt(input);//the string entered here will be parsed into integer using parseInt
		System.out.println(100/a);
	}
	catch(ArithmeticException e) 
	{
			System.out.println("Inside ArithmeticException catch block:");

	}
	finally
	{
		System.out.println("Inside finally block;");

	}
	}
}



/*BasicCalc.java:21: error: unreported exception IOException; 
   must be caught or declared to be thrown
	the above exception means: the compiler is telling theres a possibility of getting ioexception,
	if u want to handle it properly handle it by try and catch block if u dont want to handle it 
	throw ioexception */

	