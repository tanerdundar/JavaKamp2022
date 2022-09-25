package javademos.miniProjects;

public class FindingNumberMain {

	public static void main(String[] args) {
		
		int [] sayilar = {1,2,4,5,6,8,9,0};
		int aranacak = 5;
		boolean varMi  = false;	
		
		for (int sayi : sayilar) {
			
			if (sayi == aranacak) {
				varMi =true;
				break;
			}
			
		}
		
		System.out.println(aranacak);
		
		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		} else {
			System.out.println("Sayi mevcut degildir.");
		}

	}

}
