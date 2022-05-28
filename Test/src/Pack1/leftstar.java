package Pack1;

public class leftstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
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
