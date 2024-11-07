// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]); 	
		double rate = Double.parseDouble(args[1]);
		double present = rate / 100;
		int n = Integer.parseInt(args[2]); 	
		double presentPow = Math.pow((1 + present), n);
		double futureValue = (currentValue * presentPow);
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate + "% will yield $" + (int) futureValue);
	}
}