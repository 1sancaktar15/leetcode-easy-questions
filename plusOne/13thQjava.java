class Solution {
    public int[] plusOne(int[] digits) {
        //loop backwards and look for a number less than 9.
        int n = digits.length;
        for(int i = n-1 ; i >= 0 ; i--){
        //if its less than 9 then there is no prob!
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
        /*any nine we see we turn it to a 0 because eventually we have to increment a number*/
            digits[i] = 0;
        }
        //we haven't found a number less than 9 , so all of them is 9.
        //case of [9,9,9] is troublesome. if its all nines we have to just 
        //create a new array
        //first num has to be 1,couse all the rest will be 0s.
        int[] new_number = new int[n+1];
        new_number[0] = 1;
        return new_number;
    }
}