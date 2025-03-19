package allPractice;

public class Whileloop {

	public static void main(String[] args) {

		int i=10;
		int counter=0;
		
		while(i<15) {
			System.out.println("i is :"+ i);
			i=i+3;			
			counter++;
		}
		System.out.println("Occurance is : "+counter);
	}

}
