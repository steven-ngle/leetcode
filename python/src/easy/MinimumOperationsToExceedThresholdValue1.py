class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        
        ops = 0

        for i in nums:
            if i < k:
                ops += 1
        
        return ops

        