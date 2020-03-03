package ArrayDemos;

import java.util.Scanner;

public class Prime_series {

public static void main(String []args) {

	int X, remainder = 0;
	boolean Prime=true;

	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter any number: ");
	X = scan.nextInt();

	for (int i=1; i<X; i++) {

		for (int j=2; j<i; j++) {

			if(i % j ==0) {
				Prime=false;
				break;
			}
			else {
				System.out.print(i + " ");
			}

		}
scan.close();

}
}
}