package list1_exe1_pessoa;

/* Authorship: Tiago Onofre
* Quest: 1
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Object person instantiation.
		Pessoa tiago = new Pessoa();
		
		// Scanner instantiation.
		
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		
		// Setting name
		System.out.println("Name:");
		tiago.setName( terminal.nextLine() );
		
		// Setting birth date.
		System.out.println("Birth date:");
		tiago.setBirthDate( terminal.nextLine() );
		
		// setting height.
		System.out.println("Height:");
		tiago.setHeight( terminal.nextDouble() );
		
		// Test gets
		@SuppressWarnings("unused")
		double testHeight = tiago.getHeight();
		
		@SuppressWarnings("unused")
		String testName = tiago.getName();
		
		@SuppressWarnings("unused")
		String testDate = tiago.getBirthDate();
		
		tiago.printInfo();
		
	}		

}
