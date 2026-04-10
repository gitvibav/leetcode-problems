class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        start = 0
        maxi = 0

        freq = {}

        for end in range(len(fruits)):
            freq[fruits[end]] = freq.get(fruits[end], 0) + 1

            while(len(freq) > 2):
                freq[fruits[start]] = freq.get(fruits[start], 0) - 1

                if freq[fruits[start]] == 0:
                    del freq[fruits[start]]

                start += 1

            maxi = max(maxi, end - start + 1)

        return maxi