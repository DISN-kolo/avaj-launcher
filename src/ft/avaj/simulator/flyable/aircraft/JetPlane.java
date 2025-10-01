package ft.avaj.simulator.flyable.aircraft;
import ft.avaj.simulator.flyable.aircraft.Aircraft;
import ft.avaj.simulator.flyable.aircraft.Coordinates;

public class	JetPlane extends Aircraft {
	JetPlane(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}
	void	updateConditions() {
		System.out.println("updating jetplane conditions");
	}
}
