import java.util.Scanner;
import java.lang.Math;
public class arms
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int tmp = a;
		int c = 0,sum = 0,r = 0;
		while(tmp != 0)
		{
			tmp = tmp /10;
			c++;
		}
		tmp = a;
		while(tmp != 0)
		{
			r = tmp % 10;
			sum+= Math.pow(r,c);
			tmp = tmp / 10;
		}
		if(a == sum) System.out.println("Armstrong number");
		else System.out.println("Not Armstrong");
	}
}