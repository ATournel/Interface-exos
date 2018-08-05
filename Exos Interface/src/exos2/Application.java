package exos2;

public class Application {

	public static void main(String[] args) {

		HotelCinqEtoiles fiveHotel1 = new HotelCinqEtoiles();
		HotelSeptEtoiles sevenHotel1 = new HotelSeptEtoiles();
		
		fiveHotel1.setSize(25);
		fiveHotel1.setCost(35);
		fiveHotel1.setChampagne(false);
		
		sevenHotel1.setSize(50);
		sevenHotel1.setTemperature(26);
		sevenHotel1.setChampagne(true);
		
		fiveHotel1.descriptionPiscineLuxe();
		fiveHotel1.reserverTaxiLuxe();
		System.out.println("\n\n");
		sevenHotel1.descriptionPiscineLuxe();
		sevenHotel1.reserverTaxiLuxe();

	}

}
