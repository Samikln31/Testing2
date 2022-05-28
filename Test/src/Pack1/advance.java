package Pack1;

import java.util.Scanner;
public class advance {

	public static void FibonacciSer(int no)
	{
		int i,n1=0,n2=1,n3;
		
		System.out.println("Fibonacci Series is:-"+n1+","+n2);
		
		for(i=2;i<no;++i)
		{
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int no=sc.nextInt();
		
		FibonacciSer(no);

	}
	

}
