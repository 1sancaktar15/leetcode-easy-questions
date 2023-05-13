class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        #initialize left and right
        l , r = 0 , len(nums) -1

        # now we are going to do binary search

        while l <= r:
            mid = (l + r) // 2

            if target == nums[mid]:
                return mid
            
            # in this case we searching to the right so we can update our left pointer
            if target > nums[mid]:
                l = mid + 1
            # in this case we searching to the left so we can update our right pointer
            # if target < nums[mid]:
            else:
                r = mid -1
            
        # what if we never found the target ?
        # why are we returning left ? 
        return l


