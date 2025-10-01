package ft.avaj.simulator.flyable;

public class	Tower {
	private List<Flyable*>	observers;
	public void	register(Flyable* p_flyable) {
		this.observers.add(p_flyable);
		System.out.println("added flyable");
	}
	public void	unregister(Flyable* p_flyable) {
		this.observers.remove(p_flyable);
		System.out.println("rmd flyable");
	}
	protected void	conditionsChanged() {
		System.out.println("whatever");
	}
}
