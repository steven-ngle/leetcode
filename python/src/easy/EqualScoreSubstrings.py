class Solution:
    def scoreBalance(self, s: str) -> bool:
        
        alphabet = {
            "a" : 1,
            "b" : 2,
            "c" : 3,
            "d" : 4,
            "e" : 5,
            "f" : 6,
            "g" : 7,
            "h" : 8,
            "i" : 9,
            "j" : 10,
            "k" : 11,
            "l" : 12,
            "m" : 13,
            "n" : 14,
            "o" : 15,
            "p" : 16,
            "q" : 17,
            "r" : 18,
            "s" : 19,
            "t" : 20,
            "u" : 21,
            "v" : 22,
            "w" : 23,
            "x" : 24,
            "y" : 25,
            "z" : 26,
        }

        nums = []

        for i in range(0, len(s)):
            nums.append(alphabet[s[i]])

        nums_sum = sum(nums)
        temp = 0
        for i in nums:
            temp = temp + i
            nums_sum = nums_sum - i
            if temp == nums_sum:
                return True

        return False
    # absolute garbage