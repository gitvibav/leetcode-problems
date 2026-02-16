class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        sorted_score = sorted(score, reverse = True)
        ans = []

        for s in score:
            idx = sorted_score.index(s) + 1
            if idx >= 4:
                ans.append(str(idx))
            elif idx == 1:
                ans.append("Gold Medal")
            elif idx == 2:
                ans.append("Silver Medal")
            elif idx == 3:
                ans.append("Bronze Medal")

        return ans
