package local.mishra.boot.sample.core;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestMain {

	public static void main(String... args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		Scanner sc = new Scanner(System.in);		
		LocalDate localDate = null;
		String inputString;
		do {			
			System.out.println("Please bill start date");
			while (!sc.hasNext()) {
				sc.next(); // this is important!
			}
			inputString = sc.next();
			try {
				localDate = LocalDate.parse(inputString, formatter);
			} catch (DateTimeParseException  e) {
				System.out.println("Invalid Input Date format: " + inputString);
				localDate = null;
			}
		} while (null == localDate);
		System.out.println("Thank you! Got " + localDate);
		sc.close();
	}
	
}
