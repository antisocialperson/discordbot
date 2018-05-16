// because standard deviation sucks and is annoying!
// input a number of integers (in a list, repeats allowed) and it will calculate the standard deviation
// edition 1

package botcommandsinnutshell;

import java.util.*;

public class StandardDeviation {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			list.add(sc.nextInt());
		}
		double mean = 0;
		for (int i = 0; i < list.size(); i++) {
			mean += list.get(i);
		}
		mean /= list.size();
		// System.out.println(mean);
		double sd = 0;
		for (int i = 0; i < list.size(); i++) {
			// System.out.println(Math.abs(mean - list.get(i)));
			sd += Math.abs(mean - list.get(i));
		}
		sd /= list.size();
		sd = Math.sqrt(sd);
		System.out.println(sd);

	}

}
