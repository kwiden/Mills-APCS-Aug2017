import java.util.*;
/*
 * Class assignment for 18 Jan 2018
 * @version 17 Jan 2018
 * @author Steve Lamont
 */

public class ArrayListProject {

	public static void main(String[] args) {
		ArrayList<String> source = new ArrayList<String>();
		source.add("hello");
		source.add("out");
		source.add("there");
		source.add("crazy");
		source.add("world");
		System.out.println(source);
		stringLengths(source);
	}

	public static void stringLengths(ArrayList<String> list) {
		// Assuming list is not empty
		int shortest = list.get(0).length();
		int longest = list.get(0).length();
		double total = 0;

		for (String str : list) {
			if (str.length() < shortest)
				shortest = str.length();
			if (str.length() > longest)
				longest = str.length();
			total += str.length();
		}
		double average = total / list.size();
		System.out.println("\nUsing for each loop");
		System.out.println("Shortest string is: " + shortest + "  Longest string is: " + longest
				+ " Average length is: " + average);

		shortest = list.get(0).length();
		longest = list.get(0).length();
		total = 0;
		for (int i = 0; i < list.size(); i++) {
			int thisLength = list.get(i).length();
			if (thisLength < shortest)
				shortest = thisLength;
			if (thisLength > longest)
				longest = thisLength;
			total += thisLength;
		}
		average = total / list.size();
		System.out.println("\nUsing for loop");
		System.out.println("Shortest string is: " + shortest + "  Longest string is: " + longest
				+ " Average length is: " + average);

	}
}
