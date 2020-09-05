
public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		double moneyInPocket = 78.60;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		
		}
}
}
