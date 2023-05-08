//two pointer technique
class solution{
	public int removeDuplicates(int[] nums){
		int i = 0 ;//slow pointer in i
		for(int j= 1 ; j < nums.length ;j++){//fast pointer is j
			if(nums[i] != nums[j]){
				nums[++i] = nums[j];
			}
		}
		return i+1;
	}
}