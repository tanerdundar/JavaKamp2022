package javademos.miniProjects;

public class SesliHarflerMain {

	public static void main(String[] args) {

		char harf = 'A';
		
		switch (harf) {
		
		case 'A': 
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalın sesli harf.");
			break;
		default : 
			System.out.println("Kalın sesli bir harf değil.");
		}

	}

}
