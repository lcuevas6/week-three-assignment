
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = new int[9];

		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 88;

		int firstAge = ages[0];
		int lastAge = ages[ages.length - 1];

		int ageDifference = lastAge - firstAge;

		System.out.println("Difference between last age and first age in array is " + ageDifference);

		int ageTotal = 0;
		for (int i = 0; i < ages.length; i++) {
			ageTotal = ageTotal + ages[i];

		}

		int ageAverage = ageTotal / ages.length;
		System.out.println("The average age is: " + ageAverage);

		String[] names = new String[6];

		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		int numOfCharacters = 0;
		for (String name : names) {
			numOfCharacters = name.length();

			int totalCharacters = numOfCharacters;

			System.out.println(totalCharacters);
		}
		String concatNames = String.join(" ", names);
		System.out.println(concatNames);

		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		int sumNameCharacters = 0;
		for (int i = 0; i < names.length; i++) {
			sumNameCharacters += nameLengths[i];
			System.out.println(sumNameCharacters);
		}

		System.out.println(createNewWord("Hello", 3));

		String firstName = "John";
		String lastName = "Smith";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);

		int[] myArray = new int[2];
		myArray[0] = 50;
		myArray[1] = 55;
		System.out.println(sumArray(myArray));

		double[] numAverage = new double[3];
		numAverage[0] = 33.5;
		numAverage[1] = 45.6;
		numAverage[2] = 14.7;

		System.out.println(calculateAverage(numAverage));

	}

	public static String createNewWord(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

	public static String createFullName(String x, String y) {
		return x + " " + y;

	}

	public static boolean sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;

		}
		return sum > 100;
	}

	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;

		}
		return sum / numbers.length;

	}
}
