package ft.avaj.simulator;

import	java.io.File;
import	java.io.FileNotFoundException;
import	java.util.Scanner;

public class Simulator {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: <program_name> <scenario_filename>");
			return ;
		}
		System.out.println("Processing " + args[0]);
		try {
			Scanner sc = new Scanner(new File(args[0]));
			System.out.println("Created a sc");
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
