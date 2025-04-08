import java.util.Scanner;
class merge
{
public static void main(String args[])
{
int i,n,m,p,pos; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of array elements arr1");
n=sc.nextInt();
System.out.println("Enter number of array elements arr2");
m=sc.nextInt();
System.out.println("Enter number of elements in merged array arr3");
p=sc.nextInt();

int arr1[]=new int [n];
int arr2[]=new int [m];
int arr3[]=new int [p];
System.out.println("Enter elements in array arr1");
for(i=0;i<n;i++)
 arr1[i]=sc.nextInt();
System.out.println("Enter elements in array aar2");
for(i=0;i<m;i++)
 arr2[i]=sc.nextInt();
for(i=0;i<n;i++)
 arr3[i]=arr1[i];
for(i=0;i<m;i++)
 arr3[n+i]=arr2[i];
System.out.println("Array elements after merging");
for(i=0;i<p;i++)
System.out.println(arr3[i]);
}
}
