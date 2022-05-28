package Pack1;

public class nvert_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=4;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(""+j);
			}
			System.out.println(" ");
		}
	}

}
