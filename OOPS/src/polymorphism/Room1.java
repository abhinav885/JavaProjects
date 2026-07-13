package polymorphism;
class Room{
	private String roomType;
	private double area;
	
	public Room(String roomType, double area) {
		super();
		this.roomType = roomType;
		this.area = area;
	}

	public String getRoomType() {
		return roomType;
	}

	public double getArea() {
		return area;
	}
	
	void displayRoom() {
		System.out.println("RoomType: "+roomType);
		System.out.println("Area: "+area);
	}
}

class House{
	private String houseName;
	private Room room;
	
	public House(String houseName,String roomType,double area) {
		super();
		this.houseName = houseName;
		this.room = new Room(roomType,area);
	}
	
	void display() {
		System.out.println("HouseName: "+houseName);
		room.displayRoom();
	}
}
public class Room1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House("GreenVilla","Bedroom",250.5);
		h.display();

	}

}
