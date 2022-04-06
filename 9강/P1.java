package choi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		List<String> wordarr = Arrays.asList(word.split(" "));
		System.out.println(wordarr);
		Collections.sort(wordarr);
		System.out.println(wordarr);
	}

}


