class numberreverse
{
public static void main(String[] args)
{

numberreverse nr = new numberreverse();
int i = nr.reverse(2308);
System.out.println(i);
}

int reverse(int i)
{
int sum =0;
int r=0;
int q;
while(i>0)
{
r = i%10;
sum = sum *10 +r;
q = i/10;
i = q;
}
return sum;
}
}
