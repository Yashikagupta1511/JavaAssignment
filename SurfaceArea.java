import java.util.Scanner;

public class SurfaceArea {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the radius of sphere : ");
			double r=sc.nextDouble();
			double area=(4*22*r*r)/(7);
			System.out.println("Total SurfaceArea of sphere is:" +area);
		}
	}

}
