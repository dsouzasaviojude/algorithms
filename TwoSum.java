import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	public static void main(String[] args) {
		//Test case 1: Array has 2 elements that add up to the target
		int[] input1 = {2,5,8,9};
		int[] output = TwoSum.twoSum(input1, 10);
		printOutput(printArray(input1), output[0], output[1], 10);
		
		//Test case 2: Array has 2 elements that add up to the target one of the input elements is negative
		
		int[] input2 = {3, -5, 9, 11};
		output = TwoSum.twoSum(input2, 6);
		printOutput(printArray(input2), output[0], output[1], 6);
		
		//Test case 1: Array has 2 elements that add up to the target, the elements that add up are duplicates(9)
		int[] input3 = {3, 4, 9, 10, 7, 9};
		output = TwoSum.twoSum(input3, 18);
		printOutput(printArray(input3), output[0], output[1], 18);
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> numPosMap = new HashMap<>();
	    for(int i = 0; i < nums.length; i++) {
	        if(numPosMap.get(target - nums[i]) != null) {
	            return new int[]{numPosMap.get(target - nums[i]), i};
	        }
	        numPosMap.put( nums[i], i);
	    }
	    return null;
	}
	
	public static void printOutput(String inputArray, int first, int second, int target) {
		System.out.println("The 2 numbers in the array " +  inputArray + " that add up to " + target + "  are at position " + first + " and " + second );
	}
	
	public static String printArray(int[] inputArray) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < inputArray.length; i ++) {
			sb.append(inputArray[i]);
			if(i < inputArray.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
