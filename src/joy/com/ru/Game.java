package joy.com.ru;

public class Game {
	
private static int playercard1, playercard2, dealercard1, dealercard2, playercardtotal, dealercardtotal;
	
	public static void playerhit()
	{
		int playercard = (int) (Math.random() * 9 + 2);
		System.out.println("You drew a " + playercard + ".");
		playercardtotal +=playercard;
		System.out.println("Your score is " + playercardtotal);
	}

}
