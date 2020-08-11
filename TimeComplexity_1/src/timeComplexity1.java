
public class timeComplexity1 {

	public static void main(String[] args) {

		System.out.println(foo(10));

	}

	// I believe the time complexity for this loop is considered to be O(n).
	// Only considering the first for loop for the O(n)
	// The second for loop is O(1)
	public static int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++)
			result += j;

		return result;
	}

}
