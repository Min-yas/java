'''while loop'''
import java.util.Scanner;

class While
{
	public static void main(String args[])
	{
		int num;

		System.out.println("Enter value for condition: ");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		
		while(num>=0)
		{
			System.out.println("learn coding");
			num-=num;
		}
	}
}
