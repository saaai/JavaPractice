//to take the input from the user and print it as the output

import java.io.*;
//import java.io.IntputStreamReader;
//import java.io.BufferedReader;

class DynamicInput
{
	public static void main(String args[]) throws IOException
	{
		//IntputStream in = System.in;//capturing the inputstreamand storing it in "in"
		InputStreamReader isr = new InputStreamReader(System.in);
		//passing "in" inputstreamreader constructor
		//instead of giving "in" inside the constructor we can directly give System.in
		//IntpurStreamReader isr = new IntpurStreamReader(System.in); instead of storing System.in in "in"
		BufferedReader reader = new BufferedReader(isr);
		//passing the inputstreamreader(isr) object created above
		System.out.println("please enter a value:");
		String msg = reader.readLine();
		//by using the bufferreader object call the readline method, now caputre the data in the "msg" variable
		System.out.println(msg);
	}
}