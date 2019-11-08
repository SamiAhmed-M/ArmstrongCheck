package armstrong;

public class ArmSum {
	
	public static void display(String str) {
		int sum = 0;
		for (int i=0; i<str.length(); i++) {
			int x = Character.getNumericValue(str.charAt(i));
			int prod = 1;
			for (int j=1; j<=str.length(); j++) {
				prod = prod * x;
			}
			sum = sum + prod;
		} // End for loop
		if (Integer.parseInt(str) == sum) {
			System.out.println("The number " + str + " is an Armstrong Number");
		}
		else {
			System.out.println("The number " + str + " is not an Armstrong Number");
		}
		
	}

}
