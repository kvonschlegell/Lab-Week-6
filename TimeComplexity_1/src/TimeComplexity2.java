
public class TimeComplexity2 {

	public static void main(String[] args) {

		System.out.println(bar(20));

	}

	// I think the time complexity is O(log(N)) because N is increasing
	// exponentially.
	// With 20 plugged in i will start at 1, then will be 2, 4, 8, 16 after each
	// loop.
	public static int bar(int N) {
		int result = 1;
		for (int i = 1; i < N; i *= 2)
			result += 2;

		return result;
	}

}
