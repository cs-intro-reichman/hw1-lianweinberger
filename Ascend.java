// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int) (lim * Math.random());
		int b = (int) (lim * Math.random());
		int c = (int) (lim * Math.random());
		int temp = Math.min(a, b);
		int min = Math.min(temp, c);
		temp = Math.max(a, b);
		int max = Math.max(temp, c);
		int between = a + b + c - min - max;
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " +  between + " " + max);
	}
}
