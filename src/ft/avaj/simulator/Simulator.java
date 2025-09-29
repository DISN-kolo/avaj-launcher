package ft.avaj.simulator;

import	java.io.File;
import	java.io.FileNotFoundException;
import	java.util.Scanner;

public class Simulator {
	private static int	stepsAmt = 0;
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: <program_name> <scenario_filename>");
			return ;
		}
		System.out.println("Processing " + args[0]);
		try {
			Scanner sc = new Scanner(new File(args[0]));
			System.out.println("Created a sc");
			boolean	isFirstLine = true;
			while (sc.hasNextLine()) {
				if (isFirstLine) {
					if (sc.hasNextInt()) {
						Simulator.stepsAmt = sc.nextInt();
						if (stepsAmt <= 0) {
							System.err.println("Incorrect amount of steps (must be > 0)");
							return ;
						}
						System.out.println("Parsed steps amount: " + Simulator.stepsAmt);
						String remainder = sc.nextLine();
						System.out.println("The remainder is: '" + remainder + "'");
					}
					else
					{
						System.err.println("Steps weren't specified");
						return ;
					}
					isFirstLine = false;
					continue ;
				}
				System.out.println(sc.nextLine());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
