//Java Stdin and Stdout 1

import java.util.Scanner;

public class Easy2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		var i = 1;
		var str = "";
		while (i < 4) {
			str += scan.nextLine();
			if (i != 3) {
				str += " ";
			}
			i++;
		}
		var result = str.split(" ");
		
		for (String a : result) {
			System.out.println(Integer.valueOf(a));
		}
	}
}
