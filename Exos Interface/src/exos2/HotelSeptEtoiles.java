package exos2;

public class HotelSeptEtoiles implements HotelLuxe{

	public int size;
	public int temperature;
	public int cost;
	public boolean champagne;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isChampagne() {
		return champagne;
	}

	public void setChampagne(boolean champagne) {
		this.champagne = champagne;
	}

	public void descriptionPiscineLuxe() {
		System.out.println("This 7 stars hotel has a "+getSize()+" meters-long pool with a constant "+getTemperature()+"°C temperature.");
	}
	
	public void reserverTaxiLuxe() {
		System.out.println("We provide a taxi service for wich we take no fee.");
		if(isChampagne()==true) {
			System.out.println("Our taxis will have Champagne on board.");
		}
		else {
			System.out.println("Our taxis will NOT have Champagne on board.");
		}
	}
	
}
