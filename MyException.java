class MyException extends Exception
{
	//deafualt constructor is already here if we write it here or not.
	MyException()//creating constructor
	{
		super("For input string:\"0\" ");//parent class here is exception class
		System.out.println("enter the correct input greater than 0");
	}
		
}