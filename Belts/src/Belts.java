/*
 * This is the initial Belts class, which will create a belt containing
 * an integer array and use the integers to determine what is on the belt,
 * where it is on the belt, and what to do with the numbers at certain 
 * points along the belt (i.e. adding a bin at the start, converting to a
 * box at the packer station)
 */
import java.util.stream.IntStream;

public class Belts {

	// Note: 1 will denote a bin, 2 will denote box, 0 is empty
	int size;
	int bin = 1;
	int box = 2;
	int[] itemsonbelt;
	
	public Belts(int size){
		// Length of belt, according to Floor
		this.size = size;
		// Will be a simple array to dictate what is on belt
		itemsonbelt = new int[size];
	}
	
	public void moveBelt(){
		// Will shift all elements in itemsonbelt array over one
		int temp = itemsonbelt[size-1];
		for(int i = size-2; i >= 0; i--){
			itemsonbelt[i+1] = itemsonbelt[i];			
		}
		itemsonbelt[0] = temp;
		
		/* Currently works for initial floor plan
		 * Will take check if a bin is at packer spot, then
		 * pack it into a box and put it back on the belt
		 */
		if(itemsonbelt[3] == bin){
			packBin();
			addBox();
		}
		
		/* Will work for general floor plan  
		 * Remove the box at the end and send it to
		 * the shipping dock
		 */
		if(itemsonbelt[size-1] == box){
			pushBox();
		}
		
	}
	
	public void addBin(){
		itemsonbelt[0] = bin;
	}
	
	public void packBin(){
		/* This will remove a bin from itemsonbelt once it reaches the packing
		 * area and package it into a box
		 */
		
		/*Sets where box was removed to 3 to denote packing is taking place
		 * i.e. this will take time before a box is added
		 */
		itemsonbelt[3] = 3;
	}
	
	public void addBox(){
		/* Same idea as addBin() but will add a box at the packing area
		 * and clears the '3' holder from the line to continue movement
		 */
		itemsonbelt[3] = 0;
		itemsonbelt[4] = box;
	}
	
	public void pushBox(){
		// Will send packed box to the docking area to be shipped out
		itemsonbelt[size-1] = 0;
		
	}
	
	public boolean isEmpty(){
		// Method will see if belt is empty
		if(IntStream.of(itemsonbelt).sum() != 0){
			return false;
		}
		
		return true;
	}
	
}
