
public class BinarySearch {

	public static void main(String[] args) {

		int[] binary = { 1, 14, 15, 24, 55, 59, 73, 90, 94, 99 };
		search(binary, 73);

	}

	// 1) Left Index= 0 [1] Right Index= 9 [99] Mid Index= 4 [55]
	// 2) Left Index= 5 [59] Right Index= 9 [99] Mid Index= 7 [90]
	// 3) Left Index= 5 [59] Right Index= 6 [73] Mid Index= 5 [59]
	// 4) Left Index= 6 [73] Right Index= 6 [73] Mid Index= 6 [73]-Target found
	public static void search(int[] num, int target) {
		int left = 0;
		int right = num.length - 1;
		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;
			if (num[mid] == target) {
				System.out.println("FOUND " + target);
				break;

			} else if (target > num[mid]) {
				left = mid + 1;
				System.out.println("LOW " + num[mid]);

			} else if (num[mid] > target) {
				right = mid - 1;
				System.out.println("HIGH " + num[mid]);

			}
		}
	}

}
