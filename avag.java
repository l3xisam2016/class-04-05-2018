package arrs;
import java.util.Scanner;
public class avag {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an arrays");
		
		int [] n1=new int[5];
		double e= 0;
		
		for(int i=0; i < n1.length; i++) {
			n1[i]=scanner.nextInt();
			e=n1[i]+e;
			
		}
		double ave=e/n1.length;
		System.out.println(ave);
	}

}
