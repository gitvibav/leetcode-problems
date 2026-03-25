class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        if sum(gas) < sum(cost):
            return -1

        sum1 = 0
        res = 0

        for i in range(len(gas)):
            sum1 += (gas[i] - cost[i])

            if sum1 < 0:
                sum1 = 0
                res = i+1

        return res