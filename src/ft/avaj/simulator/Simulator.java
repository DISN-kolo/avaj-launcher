package ft.avaj.simulator;

public class Simulator {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: <program_name> <scenario_filename>");
			return ;
		}
		System.out.println("Processing " + args[0]);
	}
}
