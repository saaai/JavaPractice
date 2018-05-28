class ConstructorDemo
{
	int a;//instance variables
	int b;//instance variables

	ConstructorDemo()//Creating constructor should use the class name as the constructor name while creating it
	{
		System.out.println("Inside Constructor");

	}
	ConstructorDemo(int a, int b)
	{
		this.a = a;//by using this.a we can refere the instance variable "a" to the local variable "a"
 		//left side "a" is the instance variable and the right side "a" variable is the local variable
		this.b = b;//by using this.a we can refere the instance variable "b" to the local variable "b"
 		//left side "b" is the instance variable and the right side "b" variable is the local variable
		System.out.println("Inside parameterised constructor");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		ConstructorDemo demo = new ConstructorDemo(100, 200)/*this is the portion where it will excute the Constructor*/;
		ConstructorDemo demo1 = new ConstructorDemo();	
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

/*
o/p:

sais-MacBook-Pro:javapractice saigopal$ javac ConstructorDemo.java
sais-MacBook-Pro:javapractice saigopal$ java ConstructorDemo

Inside parameterised constructor
Inside Constructor

*/