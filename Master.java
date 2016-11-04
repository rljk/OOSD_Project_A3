import java.util.Timer;

public class Master
{
	Inventory inventory;
	Visualizer visualizer;
	
	public Visualizer GetVisualizer()
	{
		return visualizer;
	}
	
	public Inventory GetInventory()
	{
		return Inventory;
	}
	
	public static void main(String[] args)
	{
		inventory = new Inventory();
		visualizer = new Visualizer();
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				//Call .tick() on everything - in what order?
				//Call this last:
				Visualizer.tick();
			}
		}, 0, 1000);
	}
}