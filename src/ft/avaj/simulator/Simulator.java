package ft.avaj.simulator;

import	java.io.File;
import	java.io.FileNotFoundException;
import	java.util.Scanner;
import	java.lang.Exception;

public class Simulator {
	private static int		stepsAmt = 0;
	private static Scanner	sc = null;

	private static void	firstLineHandling() throws Exception {
		if (Simulator.sc.hasNextInt()) {
			Simulator.stepsAmt = Simulator.sc.nextInt();
			if (stepsAmt <= 0) {
				throw new Exception("Incorrect amount of steps (must be > 0)");
			}
			System.out.println("Parsed steps amount: " + Simulator.stepsAmt);
			String remainder = Simulator.sc.nextLine();
			System.out.println("The remainder is: '" + remainder + "'");
		}
		else
		{
			throw new Exception("Steps weren't specified");
		}
	}

	private static void	normalLineHandling(String line) {
		Scanner	lineSc = new Scanner(line);
		String	localToken;
		int		counter = 0;
		while (lineSc.hasNext()) {
			localToken = lineSc.next();
			System.out.println(counter + ": " + localToken);
			counter++;
		}
	}

	public static void	main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: <program_name> <scenario_filename>");
			return ;
		}
		System.out.println("Processing " + args[0]);
		try {
			Simulator.sc = new Scanner(new File(args[0]));
			System.out.println("Created a sc");
			boolean	isFirstLine = true;
			String	currentLine;
			while (sc.hasNextLine()) {
				if (isFirstLine) {
					isFirstLine = false;
					Simulator.firstLineHandling();
					continue ;
				}
				currentLine = sc.nextLine();
				System.out.println("current line:");
				System.out.println(currentLine);
				Simulator.normalLineHandling(currentLine);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
