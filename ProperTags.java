package logic;

import java.util.Scanner;

public class ProperTags {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		int op = 0;
		int cl = 0;
		String sr[] = s1.split(" ");
		for (int i = 0; i < sr.length; i++) {
			if (sr[i].charAt(0) == '<'
					&& sr[i].charAt(sr[i].length() - 1) == '>') {
				op += 1;
			}
			if (sr[i].charAt(0) == '<' && sr[i].charAt(1) == '/'
					&& sr[i].charAt(sr[i].length() - 1) == '>') {
				cl += 1;
			}
		}
		op /= 2;
		if (op == cl) {
			System.out.println("Proper");
		} else {
			System.out.println("Not Proper");
		}
		s.close();
	}

}