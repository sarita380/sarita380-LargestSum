
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int largeSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                int numb1 = nums.get(i);
                int numb2 = nums.get(j);
            if(numb1!= numb2){
                int sum = numb1 +numb2;
                if(sum>largeSum){
                    largeSum = sum;
                }   
            }else{
                int sum = numb1*2;
                if(sum>largeSum){
                    largeSum = sum;
                }
            }
        }
        }
        return largeSum;
    }
}