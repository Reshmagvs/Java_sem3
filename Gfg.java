class Gfg {

public static void main(String args[])
{
String s = "Welcome! to Sathyabama university Planet";
int i;
char chr;
int b=s.length();
System.out.println(b);
char ch = s.charAt(3);
System.out.println(ch);
ch = s.charAt(0);
System.out.println(ch);
for(i=0;i<b;i++){
chr=s.charAt(i);
{
if(chr=='e')
chr='*';
}
System.out.print(chr);
}
}
}
