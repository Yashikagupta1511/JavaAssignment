import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a character ::");
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().charAt(0);
        int asciiValue = ch;
        System.out.println("ASCII value of the given character is ::"+asciiValue);
	}

}
