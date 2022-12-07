package com.pack1;
import java.util.Scanner;
public class Scannerclass 
{
static Scanner sc=new Scanner(System.in);//this is the way to create an object for scanner class
void meth1()
{
	System.out.println("please enter 1st number");
	int a=sc.nextInt();
	System.out.println("a value:"+a);
	System.out.println("please enter 2nd number");
	int b=sc.nextInt();
	System.out.println("b value:"+b);
	int c=a+b;
	System.out.println("Addition c:"+c);
}
int meth2(String s)
{
	System.out.println("meth2() called");
	System.out.println("s value:"+s);
	System.out.println("please enter a number to return from meth2()");
	int x=sc.nextInt();
	return x;
	//return sc.nextInt();
}
void meth3()
{
     System.out.println("meth3() called");
     System.out.println("please enter your name");
     String name=sc.next();
     System.out.println("what is your age");
     int age=sc.nextInt();
     if(age>=18)
     {
    	 System.out.println(name+" as your age is "+age+" which is greater than 18 you are eligible to vote");
     }
     else
     {
    	 System.out.println(name+" as your age is "+age+" which is less than 18 you are not eligible to vote");
     }
}
void meth4()
{
	System.out.println("what is your name??");
	String name=sc.next();
	System.out.println("Name:"+name);
}
public static void main(String[] args) 
{
	Scannerclass aobj=new Scannerclass();
	aobj.meth1();
	System.out.println("---------------");
	System.out.println("please enter s value for meth2()");
	int x=aobj.meth2(sc.next());
	System.out.println("meth2() is returning:"+x);
	System.out.println("-----------------");
	aobj.meth3();
	System.out.println("----------");
	aobj.meth4();
}
}







