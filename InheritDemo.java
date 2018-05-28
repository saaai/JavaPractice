class InheritDemo
{
	public static void main (String args[])
	{
		ChildClass cc = new ChildClass(100);/*whenever im asking to execute child class parameterized constructor,
		 it should only excute that child class parameterized constructor*/
		System.out.println(cc.add());
	}
}