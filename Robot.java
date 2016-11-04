




public class Robot{
	
	private int rHeightWidth;
	
	// size of robot
	
	private int X;
	
	// x-coordinate of robot
	
	private int Y;
	
	// y-coordinate of robot
	
	private int direction = 1;
	
	// direction: 1 = north 2 = east 3 = south 4 = west
	
	private int charge;
	
	// charge of robot
	
	private String object = "";
	
	// holder for object that robot is carrying
	
	private boolean hasObject = false;
	
	// boolean to see if robot has object
	
	
	public Robot(int x, int y, int size){
		
		X = x;
		Y = y;
		rHeightWidth = size;
		charge = 1000;
		
		
	}
	
	int getCharge{
		
		
		return charge;
		
	}
	
	
	void tickCharge(){
		
		
	charge--;
		
	}
	
	void reCharge(){
		
		charge = 1000;
		
	}
	
	boolean hasObject(){
		
		return hasObject;
		
	}
	
	void getObject(String obj){
		
		object = obj;
		hasObject = true;
		
	}
	
	void unloadObject(){
		
		object = "";
		hasObject = false;
		
	}
	
	String returnObject(){
		
		
		return object;
		
	}
	
	
	int getX(){
		
		return X;
		
	}
	
	int getY(){
		
		return Y;
		
	}
	
	
	void moveForward(){
		
		if(direction == 1){
			
			Y++;
			
		}
		
		else if(direction == 2){
			
			X++;
			
		}
		
		else if(direction == 3){
			
			Y--;
			
		}
		
		else if(direction == 4){
			
			X--;
			
		}
		
		
		
	}
	
	
		void moveBackward(){
		
		if(direction == 1){
			
			Y--;
			
		}
		
		else if(direction == 2){
			
			X--;
			
		}
		
		else if(direction == 3){
			
			Y++;
			
		}
		
		else if(direction == 4){
			
			X++;
			
		}
		
		
		
	}
	
	void roatateLeft{
		
		
		if(direction == 1){
			
			direction = 4;
			
			
		}
		
		else{
			
			direction--;
			
		}
		
		
		
	}
	
	
		void roatateRight{
		
		
		if(direction == 4){
			
			direction = 1;
			
			
		}
		
		else{
			
			direction++;
			
		}
		
		
		
	}
	
	
	
}