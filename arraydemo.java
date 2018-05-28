class arraydemo
{
	public static void main (String args[])
	{
		System.out.println("size: "+ args.length);
		System.out.println(args[0]);
		String str = args[0];
		char c = str.charAt(0);
		System.out.println(c);

		/*int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
		
		System.out.println(args[0] + args[1]);*/

		arraydemo ad = new arraydemo();
		ad.length();
		ad.regular();
		//ad.parseInt();
	}

	void length()//to find the length of the array using for loop
	{
		int a[] = new int[5];//creating space for the array
		a[1]=10;//allocating the numbers for the array
		a[2]=20;
		a[3]=30;//allocating the numbers for the array

		for(int i=0;i<a.length;i++)//assigning the condition of variable "a" to the length 
		{
			System.out.println(a[i]);
		}
	}

	void regular()//regular array implementation
	{
		int a[] ={10,20,30,40}; 
		//int[] a =
		//int [] a =
		System.out.println(a[2]);
	}

	/*static int parseInt(String)//int as a return value and string as the input from the user  
	{
		//to call the method first give classname.methodname
		//parseInt is an method in the integer class in java api documents 
		


	}*/

}