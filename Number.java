class Number {
public static void main(String arg[]){
int a=3,b=5,c=7,gn=0,sn=0;
if((a>b)&&(a>c))
{
if(b>c)
{
gn=100*a+10*b+c;
sn=100*c+10*b+a;
}
else
{
gn=100*a+10*b+c;
sn=100*b+10*c+a;
}
}
if((b>a)&&(b>c))
{
if(a>c)
{
gn=100*b+10*a+c;
sn=100*c+10*a+b;
}
else
{
gn=100*b+10*c+a;
sn=100*a+10*c+b;
}
}
if((c>a)&&(c>b))
{
if(a>b)
{
gn=100*c+10*a+b;
sn=100*b+10*a+c;
}
else
{
gn=100*c+10*b+a;
sn=100*a+10*b+c;
}
}
System.out.println("The greatest number " + gn);
System.out.println("The smallest number " + sn);
}
}
