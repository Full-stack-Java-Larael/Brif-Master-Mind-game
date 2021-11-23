package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class algo2 {
	public algo2() {
		
	    Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		HashMap<String, String> numbers = new HashMap<String, String>();
		int maxTrays = 10;
		int tray = 0;
		numbers.put("rands", ""+rand.nextInt((9999 - 1111) + 1111));
		numbers.put("guesses", "");
		numbers.put("result", "");
		do {
			System.out.println("Guess the numbers, enter 4 numbers between 0 and 9: ex:" + numbers.get("rands"));
			numbers.put("guesses", userInput.next("[0-9]{4}"));
			String tmpResult = "";
			char checked = '-';
			
			for (int i = 0; i < numbers.get("guesses").toCharArray().length; i++) {
				if ((checked != numbers.get("rands").toCharArray()[i] ) && ((numbers.get("guesses")).toCharArray()[i] == (numbers.get("rands")).toCharArray()[i])) {
					tmpResult = tmpResult + "#";
				}else if(checked == numbers.get("rands").toCharArray()[i]){				
					tmpResult = tmpResult + "o";
				}
				else {
					tmpResult = tmpResult + "o";
				}
				numbers.put("results", tmpResult);
				checked = numbers.get("guesses").toCharArray()[i];
				System.out.println(checked);
			}
			System.out.println(numbers.get("results"));
			tray++;
		} while (tray < maxTrays);
		
		
		
	}
}
