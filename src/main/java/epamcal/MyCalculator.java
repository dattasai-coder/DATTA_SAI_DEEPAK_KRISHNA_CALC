package epamcal;

import java.util.Scanner;
//SOLID PRINCIPLE
class A
{
	void addition(int a,int b)
	{
		System.out.print("Addition is  :"+ a+b);
	}
}
class B
{
	void subtract(int a,int b)
	{
		System.out.print("Subtract is  :"+ (a-b));		
	}
}
class C
{
	void multiply(int a,int b)
	{
		System.out.print("Multiplication is  :"+ a*b);
	}
}
class D
{
	void divide(int a,int b)
	{
		System.out.print("Division is  :"+ a/(double)b);		
	}
}
public class MyCalculator {
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number :");
		int num2 = sc.nextInt();
		System.out.print("Enter operator :");
        char op = sc.next().charAt(0);
		switch (op) { 		//	KISS PRINCIPLE
	    case '+':
	        A a = new A();
	        a.addition(num1, num2);
	        break;
	    case '-':
	        B b = new B();
	        b.subtract(num1, num2);
	        break;
	    case '*':
	        C c = new C();
	        c.multiply(num1, num2);
	        break;
	    case '/':
	        D d = new D();
	        d.divide(num1, num2);
	        break;
	    default:
	        System.out.printf("Error!!! operator is incorrect");
	    }
	}
}
