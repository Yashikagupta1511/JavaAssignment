import java.util.Scanner;

public class Integer {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first number");
	int a= sc.nextInt();
	System.out.println("Enter the second number");
	int b= sc.nextInt();
	System.out.println("Enter the third number");
	int c= sc.nextInt();
	int d= a+b+c;
	System.out.println("Total=" +d);
}
}
