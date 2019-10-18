package hospital;

public class Room {
	
	private static final int BEDS_COUNT = 3;
	
	private Bed[] beds = new Bed[BEDS_COUNT];
	private Boolean isMaleRoom;
	private int roomNumber = 1;
	private static int num = 1;
	
	public Room(){
		this.beds[0] = new Bed();
		this.beds[1] = new Bed();
		this.beds[2] = new Bed();
		this.roomNumber = num++;
	}
	
	public int getFreeBeds(){
		int freeBeds = 0;
		for (int i = 0; i < beds.length; i++) {
			if (beds[i].isEmpty()) {
				freeBeds++;
			}
		}
		return freeBeds;
	}
	
	public boolean isFull(){
		for (int i = 0; i < beds.length; i++) {
			if (beds[i].isEmpty()) {	
				
				return false;
			}
		}
		return true;
	}

	public Boolean IsMaleRoom() {
		
		if (isMaleRoom == null) {
			return null;
			
		}
		return isMaleRoom;
	}

	public void setIsMaleRoom(Boolean isMaleRoom) {
		this.isMaleRoom = isMaleRoom;
	}

	public Bed[] getBeds() {
		return beds;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
}
