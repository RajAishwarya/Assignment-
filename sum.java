import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int num1,num2,sum;
System.out.println("enter 1st number");
Scanner sc=new Scanner(System.in); 
num1=sc.nextInt();
System.out.println("enter 2nd number");
num2=sc.nextInt();
sum=num1+num2;
System.out.println("sum is "+sum);
}
}
