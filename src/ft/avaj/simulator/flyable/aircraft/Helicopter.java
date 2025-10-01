package ft.avaj.simulator.flyable.aircraft;
import ft.avaj.simulator.flyable.aircraft.Aircraft;
import ft.avaj.simulator.flyable.aircraft.Coordinates;

public class	Helicopter extends Aircraft {
	Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}
	void	updateConditions() {
		System.out.println("updating helicopter conditions");
	}
}
