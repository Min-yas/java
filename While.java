import java.util.Scanner;

class While
{
	public static void main(String args[])
	{
		int n;

		System.out.println("Enter value for condition: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		while(n>=0)
		{
			System.out.println("learn coding");
			n-=n;
		}
	}
}