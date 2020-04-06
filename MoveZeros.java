import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nbrs = {0,1,0,3,12};
		moveZeroes(nbrs);
		System.out.println(Arrays.toString(nbrs));
	}
	 public static void moveZeroes(int[] nums) {
	        int nonZeros = 0;
	        for(int i = 0; i<nums.length;i++) {
	        	if(nums[i]!=0) {
	        		nums[nonZeros] = nums[i];
	        		nonZeros++;
	        	}
	        	
	        }
	        for(int k = nonZeros;k<nums.length;k++) {
	        	nums[k] = 0;
	        }
	    }

}
