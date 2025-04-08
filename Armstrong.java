class Armstrong
{
public static void main(String arg[])
{
int a,num,s=0,n=371;
num=n;
while(n>0)
{
a=n%10;
s=s+a*a*a;
n=n/10;
}
if(num==s)
System.out.println("The number" + num +"is an Armstrong Number");
else
System.out.println("The number" + num +"is not an Armstrong Number");
}
}