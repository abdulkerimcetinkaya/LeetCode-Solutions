package Arrays101;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int s = nums[i];
            squares[i] = s * s;
        }
        int temp;
        for(int i = 0;i < squares.length; i++){
            for(int j = 0; j < squares.length-1; j++){
                if(squares[j] > squares[j + 1]){
                    temp = squares[j];
                    squares[j] = squares[j + 1];
                    squares[j + 1] = temp;
                }
            }
        }
        return squares;
    }
}
