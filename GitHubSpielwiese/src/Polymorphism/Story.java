package Polymorphism;

public class Story {

	public Story() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Vehicle[] vehicle = new Vehicle[3];
		vehicle[0] = new Vehicle();
		vehicle[1] = new Car();
		vehicle[2] = new Plane();
		
		for(int i = 0; i < vehicle.length; i++) {
			vehicle[i].move();
		}
	}

}
