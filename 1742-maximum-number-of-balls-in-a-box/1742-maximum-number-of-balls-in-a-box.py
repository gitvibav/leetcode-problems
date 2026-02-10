class Solution:
    def countBalls(self, lowLimit: int, highLimit: int) -> int:
        freq = {}

        while lowLimit <= highLimit:
            elem = str(lowLimit)
            sum = 0
            for i in elem:
                sum += int(i)
            if sum not in freq:
                freq[sum] = 1
            else:
                freq[sum] += 1
            lowLimit += 1

        maxi = -1
        for k,v in freq.items():
            if v > maxi:
                maxi = max(maxi, v)

        return maxi