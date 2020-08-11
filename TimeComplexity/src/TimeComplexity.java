
public class TimeComplexity {

	public static void main(String[] args) {

		System.out.println(foo(2));
	}

	public static int foo(int N) {

		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					result++;
				}
			}
		}

		return result;
	}

}
