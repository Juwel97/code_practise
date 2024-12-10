package critical_thinking;

import java.util.stream.IntStream;

public class Print_0_10_Without_Loop {
	
	public static void main(String[] args) {
		
		int start = 0;
		int end = 10;
		
		// Using recursion
		printService(start,end);
		
		//using Stream
		IntStream.rangeClosed(start, end)  
        .forEach(System.out::println);  
		
		
	}

	private static void printService(int start, int end) {
		
		if(start <= end ) {
			System.out.println(start);
			start++;
			printService(start,end);
		}
		
	}

}
