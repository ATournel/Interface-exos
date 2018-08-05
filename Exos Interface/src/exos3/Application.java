package exos3;

public class Application {

	public static void main(String[] args) {
		
		Jeep jeep1 = new Jeep();
		Hovercraft hover1 = new Hovercraft();
		
		jeep1.setName("Land Rover");
		jeep1.setMaxPassengers(6);
		jeep1.setMaxSpeed(180);
		jeep1.setNumWheels(4);
		
		hover1.setName("SR.N4");
		hover1.setMaxPassengers(254);
		hover1.setMaxSpeed(111);
		hover1.setNumWheels(0);
		hover1.setDisplacement(8);
		
		System.out.println("This Jeep can fit "+jeep1.getMaxPassengers()+" passengers, has "+jeep1.getNumWheels()+" wheels"
				+ " and can go up to "+jeep1.getMaxSpeed()+"Km/h!");
		jeep1.soundHorn();
		System.out.println("I am the "+jeep1.getName()+"!");
		System.out.println("\n\n");
		System.out.println("This hovercraft can fit "+hover1.getMaxPassengers()+" passengers, has "+hover1.getNumWheels()+" wheels"
				+ " and can go up to "+hover1.getMaxSpeed()+"Km/h!");
		System.out.print("It can ");
		hover1.enterLand();
		System.out.print("But also ");
		hover1.enterSea();
		System.out.println("I am the "+hover1.getName()+"!");

	}

}
