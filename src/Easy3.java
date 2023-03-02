// Java If-Else

import java.io.IOException;
import java.util.Scanner;

public class Easy3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		
		if (N % 2 == 0) {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			} else if (N >= 6 && N <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
	}
}
