package allPractice;

public class ContinueKeyword {

	/*continue keyword */
	public static void main(String[] args) {

		for(int i=0; i<=20; i++) {
			
			if(i==15) {
				System.out.println(" Skipped at : "+i);
				continue;
//				break;
			}
			System.out.println(" i is : "+i);
		}
		
	}

}
