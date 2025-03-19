package allPractice;

public class BreakKeyword {

	public static void main(String[] args) {

		for(int i=0; i<=55; i++) {
			
			if(i==45) {
				System.out.println(" Break at : "+i);
				break;
//				continue;
			}else {
				System.out.println(i);
			}
		}
	}

}
