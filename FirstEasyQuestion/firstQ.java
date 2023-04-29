class solution{
	public int [] twoSum(int [] nums , int target){
		Map <Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i ++){
			int curr = nums[i];
			//curr + x = target 
			//x = target - curr
			int x = target - curr;
			if(map.containsKey(x)){
				return new int [] { map.get(x) , i};
			}
			map.put(curr , i);
		}
		return null;//even tho it won't return null , java satisfaction
	}
}