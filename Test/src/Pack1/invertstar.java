package Pack1;

public class invertstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");	
		}
	}

}
