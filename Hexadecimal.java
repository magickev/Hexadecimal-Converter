import java.util.Scanner;

public class Hexadecimal {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
	    System.out.println("What hexadecimal would you like to convert");
	    String hexadecimal = key.nextLine();
	    int length = hexadecimal.length();
	    calculations(hexadecimal, length);
	}
	static void calculations(String hexadecimal, int length){
		double decimal = 0;
		for (int pos = 0; pos < hexadecimal.length(); ++pos  ){
			double sum;
			char ch = hexadecimal.charAt(pos);
			int chae;
			int power = length - pos - 1;
			if (Character.isLetter(ch)){
				
				int n = ch - 'a' + 10;
				sum = java.lang.Math.pow(16, power );
				sum = sum*n;
				decimal = decimal + sum;
			}
			else {
				
				chae = hexadecimal.charAt(pos);
				chae = chae - '0';
				sum = java.lang.Math.pow(16, power );
				sum = sum*chae;
				decimal = decimal + sum;
			}
			
			
			
			
			
			
			
		}
		System.out.printf("%f", decimal);
		
	}
}
