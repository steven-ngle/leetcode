class Solution:
    def maxContainers(self, n: int, w: int, maxWeight: int) -> int:
        containers = 0
        weight = w
        deck = n * n
        
        for i in range(deck):
            if weight > maxWeight:
                break
            containers = containers + 1
            weight = weight + w

        return containers