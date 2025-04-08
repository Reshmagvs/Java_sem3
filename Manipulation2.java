class Manipulation2
{
public static void main(String args[]){
StringBuffer k = new StringBuffer("SUBASH CHANDRA BOSE");
String a="understanding";
String b="computer";
String c="prime number";
String d1="COMPUTER FEST";
String d2="computer fest";
System.out.println("The substring from 5th position = "+a.substring(5));
System.out.println("The substring from 5th index and excluding 10th index="+a.substring(5,10));
System.out.println("The first position of the character m ="+b.indexOf('m'));
System.out.println("The position of 'm' from 5th character = "+c.indexOf('m' ,5));
System.out.println("The compare string = "+ d1.compareTo(d2));
System.out.println("The comparing strings after ignoring case ="+ d1.compareToIgnoreCase(d2));
System.out.println("The comparison using equals ignore case ="+ d1.equalsIgnoreCase(d2));
System.out.println("The reversed string= "+k.reverse());
}
}