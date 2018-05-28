//program to convert from string to a single character

class stoc
{
	public static void main (String args[])
	{
		String str = "abc";
		/*the above statement can also be written as String str = args[0]; 
		and pass the value in the terminal*/
		//String is an internal class in java
		//stoc stc = new stoc();//stc is variable of type stoc class to call 
		//if i want to call any methods of stoc class i will use "stc." to call
		//in the same way if we want to call any methods from String class and we use "str." to call 
		char c = str.charAt(0);
		System.out.println(c);

	}
}


/*

javac stoc.java
sais-MacBook-Pro:javapractice saigopal$ java stoc
a

*/