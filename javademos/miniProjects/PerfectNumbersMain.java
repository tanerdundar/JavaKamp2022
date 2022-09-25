package javademos.miniProjects;

public class PerfectNumbersMain {

	public static void main(String[] args) {

		int number = 28;
		int total = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				total += i;
			}
		}

		System.out.println(number);
		if (number < 1) {
			System.out.println("Gecersiz sayidir.");
		} else {
			if (total == number) {
				System.out.println("Mukemmel sayidir.");
			} else {
				System.out.println("Mukemmel sayi degildir.");
			}
		}

	}

}
