package exos1;

public class Application {

	public static void main(String[] args) {
		
ImplInterface1 test1 = new ImplInterface1();
		
		test1.v1=14;
		test1.v2=12;
		
		System.out.println("La note la plus basse est: "+test1.minimum()+".");
		System.out.println("La note la plus haute est: "+test1.maximum()+".");

		ImplInterface2 test2 = new ImplInterface2();
		
		test2.v1=165;
		test2.v2=189;
		test2.v3=171;
		
		System.out.println("La taille la plus basse est: "+test2.minimum()+".");
		System.out.println("La taille la plus haute est: "+test2.maximum()+".");

	}

}
