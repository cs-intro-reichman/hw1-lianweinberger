// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]); 	
		double rate = Double.parseDouble(args[1]) / 100;
		int n = Integer.parseInt(args[2]); 	
		double ratePow = Math.pow((1 + rate), n);
		double futureValue = (currentValue * ratePow);
		System.out.println((int) futureValue);
	}
}