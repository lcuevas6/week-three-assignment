
public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] numAverage = new double[3];
		numAverage[0] = 33.5;
		numAverage[1] = 45.6;
		numAverage[2] = 200.7;
		
		double averageTotal = (calculateAverage(numAverage));
		
		
		double [] numAverage2 = new double[3];
		numAverage2[0] = 98;
		numAverage2[1] = 24.6;
		numAverage2[2] = 47.4;
		
		double averageTotal2 = (calculateAverage(numAverage2));
		
		if (averageTotal > averageTotal2) {
			System.out.println("True");	
			
		}else {
			System.out.println("False");
		}
			
	}
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;		
		}
		return sum / numbers.length;		
	}			
}
