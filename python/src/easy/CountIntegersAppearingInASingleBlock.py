class Solution:
    def countSpecialIntegers(self, nums: list[int]) -> int:
        
        blocks = {}

        for i in range(len(nums)):
            block = (i == 0) or (nums[i] != nums[i - 1])
            if block:
                blocks[nums[i]] = blocks.get(nums[i], 0) + 1

        count = 0
        for i in blocks.values():
            if i == 1:
                count = count + 1

        return count