/*
123456
12345
1234
123
12
1



1
12
123
1234
12345
123456

654321
54321
4321
321
21
1
*/

public class pyramid
{
public static void main(String args[])
	{
	int i,j;
	for (i=7;i>0;i--)
		{
			for (j=1;j<i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		pyramid py = new pyramid();//for naming the object
		py.abc();//for calling the new method created below
		System.out.println();	
		py.abc1();//for calling the new method abc1 created below
	}
	
	void abc()
	{
	int i,j;
	for(i=0;i<8;i++)//for iterating in different rows until 7
	{
		for(j=1;j<i;j++)//for iterating in the same row until the i value of the row
		{
			System.out.print(j);
		}
		System.out.println();
	}
	}

	void abc1()
	{
	int i,j;
	for(i=6;i>0;i--)//for iterating in the different row from 6 to 1 in reverse order
		{
			for(j=i;j>0;j--)//for iterating in the same row until the i vale of the row in reverse order
			{
			System.out.print(j);
			}
			System.out.println();
		}
	}
} 
