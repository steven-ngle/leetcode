class Solution:
    def generateTag(self, caption: str) -> str:

        words = caption.split()

        if not words:
            return "#"
        first = words[0].lower()
        
        new = []
        for word in words[1:]:
            new.append(word.capitalize())

        res = "#" + first + "".join(new)

        return res[:100]