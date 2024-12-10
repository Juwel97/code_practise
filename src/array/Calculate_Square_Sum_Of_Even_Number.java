package array;

import java.util.Arrays;
import java.util.List;

public class Calculate_Square_Sum_Of_Even_Number {

	public static void main(String[] args) {

		// Enter your desire array
		List<Integer> intarr = Arrays.asList(1, 2, 3, 4, 5, 6);

		int sum = intarr.stream()
				.filter(x -> x % 2 == 0)
				.mapToInt(x -> x * x)
				.sum();

		System.out.println(sum);
	}

}
