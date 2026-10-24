class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        
        pref = s[:k:]
        pref_rev = pref[::-1]
        suf = s[k::]

        return pref_rev + suf