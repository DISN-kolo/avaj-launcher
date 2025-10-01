package ft.avaj.simulator.flyable.aircraft;
import ft.avaj.simulator.flyable.Flyable;
import ft.avaj.simulator.flyable.aircraft.Coordinates;
import ft.avaj.simulator.flyable.aircraft.Helicopter;
import ft.avaj.simulator.flyable.aircraft.JetPlane;
import ft.avaj.simulator.flyable.aircraft.Balloon;

public class	AircraftFactory {
	private long	id = 0;
	public FLyable* newAircraft(String p_type, String p_name, Coordinates p_coordinates) {
		switch (p_type) {
			case "Helicopter":
				return new Helicopter(this.id++, p_name, p_coordinates);
			case "JetPlane":
				return new Helicopter(this.id++, p_name, p_coordinates);
			case "Balloon":
				return new Helicopter(this.id++, p_name, p_coordinates);
			default:
				return null;
		}
	}
}
