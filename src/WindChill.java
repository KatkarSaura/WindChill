
public class WindChill {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		
		double windChillTemp = 35.7 + 0.621 * a + (0.42 * a - 35.75) * Math.pow(a,0.16);
		
		System.out.println(windChillTemp);

	}

}
