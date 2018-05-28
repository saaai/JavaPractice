class methoddemo
{
int a= 10;
int b =20;

public static void main(String[] args)
	{
		System.out.println("inside main");
        methoddemo md = new methoddemo();
		int s = md.add();
		System.out.println("Addition: "+s);
		 s = md.sub();
                System.out.println("Subtraction: "+s);
		 s = md.mul();
                System.out.println("Multiplication: "+s);
		double d = md.div();
                System.out.println("Division: "+d);
	}

int add()
{
int c = a+b;
return c;
}
int sub()
{
int c = a-b;
return c;
}
int mul()
{
int c = a*b;
return c;
}
double div()
{
double c =(double) a/b;
//to control only the output we are giving the (double) before a/b, but we can also give double while creating the division method like double div(double a, double b)

return c;
}

}
 
