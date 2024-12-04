package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Nth_Non_Repeating_Character {

	public static void main(String[] args) {

		// Given string.
		String str = "Once upon a time there is a kingdom with a great king";

		// Put the N here
		int n = 3;

		String ch = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).skip(n).findFirst().get().getKey();

		System.out.println(ch);

	}
}
