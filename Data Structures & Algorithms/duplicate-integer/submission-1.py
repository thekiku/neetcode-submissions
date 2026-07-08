class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        p = False
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i != j and nums[i] == nums[j]:
                    p = True
                    return p      # found duplicate, return immediately
        return p                  # no duplicates found
