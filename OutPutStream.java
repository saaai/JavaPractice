class primenumbers
{
	public static void main(String[] args)
{
primenumbers pn = new primenumbers();
pn.prime();
}

void prime()
{
int count;
for(int i=10;i<100;i++)
{
	count =0;
	for(int j=1;j<=i;j++)
{
    int	c = i %j;
if (c == 0)
   count++;
}
if(count == 2)
System.out.println(i);
}
}
}
