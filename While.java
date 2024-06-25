'''while-loop'''
import java.util.Scanner;

class While
{
	public static void main(String args[])
	{
		int number;

		System.out.println("Enter value for condition: ");
		Scanner r=new Scanner(System.in);
		number=r.nextInt();
		
		while(number>=0)
		{
			System.out.println("learn coding");
			number-=number;
		}
	}
}
