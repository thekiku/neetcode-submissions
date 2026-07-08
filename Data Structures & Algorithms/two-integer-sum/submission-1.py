class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l = []
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):      # j should start from i+1
                if nums[i] + nums[j] == target:    # use target, not 7
                    l.append(i)
                    l.append(j)
                    return l     