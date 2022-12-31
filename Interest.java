
public class Interest {

	public void calculate(int a, int b, double c, int d) {
		double amount = a * Math.pow(1 + (c/d), d*b);
		double cinterest = amount - a;
		System.out.println("Compound Interest after " + b + " year: "+cinterest);
		System.out.println("Amount after " + b + " years: "+amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Interest obj = new Interest();
        obj.calculate(1000,5, .02, 10);
	}

}
