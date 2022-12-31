import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Before Swapping numbers are: ");
        System.out.println("The first Number is "+a);
        System.out.println("The second Number is "+b);
        
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping numbers are: ");
        System.out.println("The first Number is "+a);
        System.out.println("The second Number is "+b);
        
	}

}
