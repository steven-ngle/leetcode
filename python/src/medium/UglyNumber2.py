class Solution:
    def nthUglyNumber(self, n: int) -> int:

        l = [1] * n

        i1 = 0
        i2 = 0
        i3 = 0

        for i in range(1, n):
            n1 = l[i1] * 2
            n2 = l[i2] * 3
            n3 = l[i3] * 5

            mini = min(n1, n2, n3)
            l[i] = mini

            if mini == n1:
                i1 = i1 + 1
            if mini == n2:
                i2 = i2 + 1
            if mini == n3:
                i3 = i3 + 1

        return l[n - 1]


        