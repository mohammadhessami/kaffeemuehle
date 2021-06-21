
public class KaffeemuehlleMain {

	public static void main(String[] args) {
		Kaffeemuehle kaffeemuhle = new Kaffeemuehle(200,100, 50);
		kaffeemuhle.oeffnen();
		kaffeemuhle.umdrehung();
		kaffeemuhle.kaffeebohnenbehaelterFuellen(100);
		kaffeemuhle.schliessen();
		kaffeemuhle.umdrehung();
		System.out.println(kaffeemuhle);
//		kaffeemuhle.umdrehung();
//		System.out.println(kaffeemuhle);
//		kaffeemuhle.kaffeebohnenbehaelterFuellen(50);
//		System.out.println(kaffeemuhle);
//		kaffeemuhle.umdrehung();
//		kaffeemuhle.umdrehung();
//		kaffeemuhle.umdrehung();
//		System.out.println(kaffeemuhle);


	}

}
