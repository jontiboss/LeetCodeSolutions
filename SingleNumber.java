
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[] {4,1,2,1,2};
		System.out.println(singleNumber(values));
	}

	/*
	 *  Since we know that the array of integers contains elements that appears twice except for one element that only appears once, 
	 *  the one we would like to find. We could use the XOR function to solve this problem since  x⊕x=0.
	 *  The number appears twice so they will eliminate each other, even if one of the factors contains other bits.
	 *  The good part about XOR is that all the bits computes at the same time.
	 *   Truthtable XOR
	 *   A|B|Y
	 *   0|0|0
	 *   0|1|1
	 *   1|0|1
	 *   1|1|0
	 * 	
	 * Given an set of numbers x={4,1,2,1,2}
	 * Initial value temp=0
	 * temp = temp ⊕ x[0] = 000⊕100 = 100
	 *  temp = temp ⊕ x[1] = 100⊕001 =101    //the first time a new value appears it will get added into temp
	 *   temp = temp ⊕ x[2] = 101⊕010 = 111  //the same happens here
	 *    temp = temp ⊕ x[3] = 111⊕001 = 110 //the second time the number appears it will get removed
	 *     temp = temp ⊕ x[4] =110⊕010 = 100 //the same happens here
	 *      temp=100=4 						 //left is the value that only appear once!
	 *       
	 * 
	 */


	public static int singleNumber(int[] nums) {
		int temp = 0;
		for(int i =0; i<nums.length;i++){
			temp ^= nums[i];
		}
		return temp;
	}
}
