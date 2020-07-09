package String;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel = new String();
		Scanner in = new Scanner(System.in);
		tel = in.nextLine();
		StringBuffer number = new StringBuffer(tel);
		System.out.println(number.replace(3,7, "****"));
	}

}
