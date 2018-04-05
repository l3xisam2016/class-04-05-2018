package arrs;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter an Array");
	
	int [] EO1= new int[5];
	
	int Evencounter=0;
	int Oddcounter=0;
	
	for(int i=0; i<EO1.length; i++ ) {
		EO1[i]=scanner.nextInt();
		
	}
	
	
	for(int i=0; i<EO1.length; i++ ) {
		if(EO1[i]%2==0) {
			Evencounter=Evencounter+1;
		}else {
			Oddcounter=Oddcounter+1;
		
		
		}
	}
System.out.println(Evencounter);
		System.out.println(Oddcounter);
	
	
	
	}

}
