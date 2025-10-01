package ft.avaj.simulator.weatherProvider;
import ft.avaj.simulator.flyable.aricraft.Coordinates;

static final int MAX_LA = 1000;
static final int MAX_H = 100;
static final int MAX_LO = 1000;

public class	WeatherProvider {
	private String[]	weather;
	private WeatherProvider() {
		System.out.println("What the frick do I do with the singleton pattern in Java? This isn't godot! Help");
	}
	public String	getCurrentWeather(Coordinates p_coordinates) {
		return weather[p_coordinates.getLatitude() + p_coordinates.getHeight() * MAX_LA + p_coordinates.getLongitude() * (MAX_LA * MAX_H)];
	}
}
