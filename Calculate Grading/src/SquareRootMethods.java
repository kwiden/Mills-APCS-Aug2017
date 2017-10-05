
public class SquareRootMethods {
	public static double sqrt(double x) {
		if (x <= 0)
			throw new IllegalArgumentException("Argument must be > 0");
		double upper = x;
		double lower = 0;
		double result = x / 2.0;
		while (((CalculateDylan.absValue(x - (result * result))) / x) > .0001) {
			if (result * result > x) {
				upper = result;
			} else {
				lower = result;
			}
			result = lower + (upper - lower) / 2.0;
		}
		return CalculateDylan.round2(result);
	}

	public static double sqrt2(double x){
		if (x <= 0) throw new IllegalArgumentException("Argument must be > 0");
		System.out.println("Finding square root of " + x + " using Babylonian method.");
		// Making first guess as x/2 given our Calculate library lacks
		// exponent calculations. It is inaccurate, but we can watch it converge.
		double result = x / 2.0;
		for (int i = 1; i <= 10; i++){
			result = (result + x / result)/2.0;
			System.out.println("after " + i + " iterations, result of " + 
					result + " is accurate within " + 
					CalculateDylan.absValue(x - result * result));
		}
		return result;
	}
}
