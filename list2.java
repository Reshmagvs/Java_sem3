import java.io.*;
import java.lang.String;
class student
{
String name;
int regno;
void getdata(String sname,int rno)
{
name=sname; regno=rno;
}
void putdata()
{
System.out.println("NAME:" +name);
System.out.println("REGNO:" +regno);
}
}
class mark extends student
{
int m1,m2,m3;
void getmarks(int mark1,int mark2,int mark3)
{
m1=mark1; m2=mark2; m3=mark3;
}
void putmarks()
{
System.out.println("MARK1:" +m1);
System.out.println("MARK2:" +m2);
System.out.println("MARK3:" +m3);
}
}
interface s
{
int pract_mark=60;
}
class result extends mark implements s
{
int total;
void display()
{
putdata();
putmarks();
System.out.println("PRACTICAL MARK:" +pract_mark);
total=m1+m2+m3+pract_mark;
System.out.println("TOTAL :" +total);
if ((m1 > 40) && (m2 > 40) && (m3 > 40) && (pract_mark > 40))
System.out.println("THE STUDENT IS PASS");
else System.out.println("THE STUDENT IS FAIL");
}
}
class list2 
{
public static void main(String args[])
{
result st=new result();
st.getdata("M.SENTHILKUMAR",1001);
st.getmarks(98,99,100);
st.display();
}
}