package Pack1;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=3;
		
		//uppe porton
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			int space= 2*(n-i);
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower part
		
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			int space= 2*(n-i);
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
