package javademos.miniProjects;

public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		int remainder = number % 2;

		boolean isPrime = true;

		if (number < 2) {
			System.out.println("Gecersiz sayi.");
		} else {

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}

			System.out.println(number);
			
			if (isPrime) {
				System.out.println("Sayi asaldir.");
			} else {
				System.out.println("Sayi asal degildir.");
			}
		}
	}

}
