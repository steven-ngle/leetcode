class Solution:
    def possibleStringCount(self, word: str) -> int:

        count = 1
        for i in range(0, len(word) - 1):
            temp = word[i]
            if temp == word[i + 1]:
                count = count + 1
            else:
                temp = word[i + 1]

        return count