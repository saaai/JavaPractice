class ChildClass extends ParentClass
{
	int a=100;

	int add()
	{
		return a + b;

	}


	ChildClass()//deafult constructor
	{
		super();
		System.out.println("Inside ChildClass constructor:");
		
	}

	ChildClass(int a)//parameterized constructor
	{
		//super(); //using this stmt calls the default parent class constructor and we cant call two construstors at the same time
		super(a);//using this stmt calls the parent class parameterized constructor due to passing of "a" inside the super paranthesis.
		System.out.println("Inside parameterized ChildClass constructor:");

		
	}
}


/*super(); must always be in the first line right after the constructor,
 u can call the cosntructor maximum of one time.*/

 /*the super();should only be at the first line,
  becos it have to initialize its super class first and then excute the child constructor statement*/