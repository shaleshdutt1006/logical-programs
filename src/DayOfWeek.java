import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the day for which you want to check");
		int d = sc.nextInt();
		System.out.println("Enter the month for which you want to check");

		int m = sc.nextInt();

		System.out.println("Enter the year for which you want to check");

		int y = sc.nextInt();

		int y0 = y - (14 - m) / 12;

		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int m0 = m + 12 * ((14 - m) / 12) - 2;

		int d0 = (d + x + 31 * m0 / 12) % 7;

		switch (d0) {
		case 0:
			System.out.println("Day is Sunday");
			break;
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		case 4:
			System.out.println("Day is Thursday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		}
	}
}