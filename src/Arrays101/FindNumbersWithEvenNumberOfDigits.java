package Arrays101;

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int stepCount = 0;
        int digitCount = 0;
        for(int i = 0; i< nums.length; i++){
            int num = nums[i];
            while(num != 0){
                num /= 10;
                stepCount++;
            }
            if(stepCount % 2 == 0){
                digitCount++;
            }
            stepCount=0;
        }
        return digitCount;
    }
}
