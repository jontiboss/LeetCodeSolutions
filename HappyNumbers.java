import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isHappy(2);

	}
	public static boolean isHappy(int n) {	
		Set<Integer> nbrs = new HashSet<Integer>();
		
		while(true) {
			n = splitMultiply(n);
			if(n==1) {
				System.out.println("happy");
				return true;
			}
			//if the number is already in the set, then we are stuck in a loop
			if(nbrs.contains(n)) {
				System.out.println("unhappy");
				return false;

			}
			//Adds the unique number to the set
			nbrs.add(n);	
		}


	}
	private static int splitMultiply(int n) {
		int sum = 0;
		while(n>0){
			// Extracts out the last digit from n,squares it and then adds it to the sum
			sum += Math.pow(n%10,2);
			//removes the extracted digit from the n
			n = n/10;
		}
		//return the new sum
		return sum;
	}
	private static int splitMultiply2(int n) {
		int reminder;
		int sum = 0;
		while(n>0){
			//break out the last digit
			reminder = n%10;
			//divide by 10 to remove the last digit that you extracted
			n = n/10;
			//multiply the number you extracted by itself and add the value to the total sum
			sum += (reminder*reminder);
			


		}
		//return the new sum
		return sum;
	}

}

