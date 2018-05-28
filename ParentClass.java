class ParentClass
{
	int a=10;
	int b=20;

	ParentClass()//deafult constructor
	{
		super();
		System.out.println("Inside ParentClass constructor:");

	}

	ParentClass(int a)//parameterized constructor
	{
		super();/*eventhough u mention the word super or not its doesnt matter,
		 the contructor always by default takes the super(); keyword in the first line of constructor*/
		System.out.println("Inside parameterized ParentClass constructor:");

	}

}