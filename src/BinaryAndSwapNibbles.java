import java.util.Scanner;

public class BinaryAndSwapNibbles {

	public static void main(String[] args) {

		String b = "";

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number you want to change : ");

		int number = sc.nextInt();

		while (number > 0) {

			int rem = number % 2;

			number = number / 2;

			b = rem + b;
		}
		int i = Integer.parseInt(b);
		System.out.println("The Binary Value of the input number is : " + i);
		int swapping = swapNibbles(i);
		System.out.println("Value after swapping the nibbles is : " + swapping);
		if (IsPowerOfTwo(swapping)) {
			System.out.println("the number after swapping is power of two");
		} else {
			System.out.println("the number after swapping nibbles is not power of two");
		}
	}

	public static int swapNibbles(int i)

	{

		return ((i & 0x0F) << 4 | (i & 0xF0) >> 4);

	}

	static boolean IsPowerOfTwo(int n) {
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 == 1) {
				return false;
			}
			n = n / 2;
		}
		return true;
	}

}
