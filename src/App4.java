
public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfHouses = 50;
		int pricePerHouse = 55;
		int timesAWeek = 2;
		
		System.out.println(amountIncomePerHour(numberOfHouses, pricePerHouse, timesAWeek));

	}//Method that will calculate weekly income.
	//I created this method to help my brother's landscaping company calculate his weekly income based on the number of house he has a month
	//how many times he goes to each house and how much he charges per house. 
	//The results will change if he loses houses or charges a differnt price. 
	
	public static int amountIncomePerHour(int x, int y, int z) {
		return (x * y * z) / 4;
		
	}

}
