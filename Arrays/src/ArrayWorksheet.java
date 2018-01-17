import java.util.*;

public class ArrayWorksheet {

	public static void main(String[] args) {
		/*
		 * simple calls
		 */
		double aveRes = average(-5, -4, 6, 80, 900);
		System.out.println("simple average: " + aveRes);
		boolean allPos = allPositive(-5, -4, 6, 80, 900);
		System.out.println("simple all positive: " + allPos);
		int num = numGT100(-5, -4, 6, 80, 900);
		System.out.println("simple GT 100: " + num);
		int lowest = lowestValue(-5, -4, 6, 80, 900);
		System.out.println("Simple lowest value: " + lowest);
		System.out.println();
		/*
		 * Array Calls Note the return values were declared earlier
		 */
		int[] sourceArray = { -5, -4, 6, 80, 900 };
		aveRes = average(sourceArray);
		System.out.println("Array average: " + aveRes);
		allPos = allPositive(sourceArray);
		System.out.println("Array all positive: " + allPos);
		num = numGT100(sourceArray);
		System.out.println("Array GT 100: " + num);
		lowest = lowestValue(sourceArray);
		System.out.println("Simple lowest: " + lowest);
		System.out.println();
		/*
		 * ArrayList Calls Note the return values were declared earlier
		 */
		ArrayList<Integer> arrayInput = new ArrayList<Integer>();
		for (int i = 0; i < sourceArray.length; i++) {
			arrayInput.add(sourceArray[i]);
		}
		aveRes = average(arrayInput);
		System.out.println("ArrayList average: " + aveRes);
		allPos = allPositive(arrayInput);
		System.out.println("ArrayList all positive: " + allPos);
		num = numGT100(arrayInput);
		System.out.println("ArrayList GT 100: " + num);
		lowest = lowestValue(arrayInput);
		System.out.println("ArrayList lowest: " + lowest);
		System.out.println();

	}

	/*
	 * Integer version of average
	 */
	public static double average(int a, int b, int c, int d, int e) {
		return (a + b + c + d + e) / 5.0;
	}

	/*
	 * Array version of average
	 */
	public static double average(int[] arr) {
		double sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum / arr.length;
	}

	/*
	 * ArrayList version of average
	 */
	public static double average(ArrayList<Integer> aList) {
		double sum = 0;
		for (int num : aList) {
			sum += num;
		}
		return sum / aList.size();
	}

	/*
	 * simple version of allPositive
	 */
	public static boolean allPositive(int a, int b, int c, int d, int e) {
		if ((a > 0) && (b > 0) && (c > 0) && (d > 0) && (e > 0)) {
			return true;
		} else
			return false;
	}

	/*
	 * Array version of allPositive
	 */
	public static boolean allPositive(int[] arr) {
		for (int n : arr) {
			if (n <= 0)
				return false;
		}
		return true;
	}

	/*
	 * ArrayList version of allPositive
	 */
	public static boolean allPositive(ArrayList<Integer> aList) {
		for (int n : aList) {
			if (n <= 0)
				return false;
		}
		return true;
	}

	/*
	 * Simple version of GT100
	 */
	public static int numGT100(int a, int b, int c, int d, int e) {
		int count = 0;
		if (a > 100)
			count++;
		if (b > 100)
			count++;
		if (c > 100)
			count++;
		if (d > 100)
			count++;
		if (e > 100)
			count++;
		return count;
	}

	/*
	 * Array version of GT100
	 */
	public static int numGT100(int[] arr) {
		int count = 0;
		for (int n : arr) {
			if (n > 100)
				count++;
		}
		return count;
	}

	/*
	 * ArrayList version of GT100
	 */
	public static int numGT100(ArrayList<Integer> aList) {
		int count = 0;
		for (int n : aList) {
			if (n > 100)
				count++;
		}
		return count;
	}

	/*
	 * Simple return lowestValue
	 */
	public static int lowestValue(int a, int b, int c, int d, int e) {
		int lowest = a;
		if (b < lowest)
			lowest = b;
		if (c < lowest)
			lowest = c;
		if (d < lowest)
			lowest = d;
		if (e < lowest)
			lowest = e;
		return lowest;
	}

	/*
	 * Array lowest value
	 */
	public static int lowestValue(int[] arr) {
		int lowest = arr[0];
		for (int n : arr) {
			if (n < lowest)
				lowest = n;
		}
		return lowest;
	}

	/*
	 * ArrayList lowest value
	 */
	public static int lowestValue(ArrayList<Integer> aList) {
		int lowest = aList.get(0);
		for (int n : aList) {
			if (n < lowest)
				lowest = n;
		}
		return lowest;
	}
}
