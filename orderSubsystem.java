import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class orderSubsystem {
	
	List<Integer> mockInventory = new ArrayList<Integer>();
	
	
	public orderSubsystem() {
		// this should be the initializer 
		// should we leave it blank 
		// or have it have an item?
		// or would that me an order method?
			// order method can take a list
			// or something to that effect and
			// just do a if the item id is 
			// in the inventory, tell the robot to 
			// go do its thing.
		List<Integer> order = new ArrayList<Integer>();
		Queue<List> orderQueue = new LinkedList<List>();
		mockInventory.add(1);
		mockInventory.add(2);
		mockInventory.add(3);
		mockInventory.add(4);
	}
	
	public boolean isItemPresent(Integer id) {
		for (Integer item : mockInventory) {	// don't know how inventory will come out
			if (id == item) { return true;}
		}
		return false;
	}
	
}
