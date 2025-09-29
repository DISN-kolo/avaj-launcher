package ft.avaj.simulator;

import	java.io.File;
import	java.io.FileNotFoundException;
import	java.util.Scanner;
import	java.lang.Exception;
import	java.util.List;

public class Simulator {
	private static int			stepsAmt = 0;
	private static Scanner		sc = null;
	private static List<String>	aircraftTypes = List.<String>of("JetPlane", "Helicopter", "Balloon");

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

	private static void	normalLineHandling(String line) throws Exception {
		Scanner	lineSc = new Scanner(line);
		String	localToken;
		int		counter = 0;
		while (lineSc.hasNext() && counter < 6) {
			localToken = lineSc.next();
			System.out.println(counter + ": " + localToken);
			if (counter == 0) {
				if (!(Simulator.aircraftTypes.contains(localToken))) {
					throw new Exception("Aircraft type '" + localToken + "' is incorrect");
				}
			}
			counter++;
		}
		if (counter != 5) {
			throw new Exception("Line '" + line + "' doesn't have exactly five elements");
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
