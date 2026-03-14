class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        freq = {}
        heap = []

        for word in words:
            if word in freq:
                freq[word] += 1
            else:
                freq[word] = 1
        
        for i,v in freq.items():
            heapq.heappush(heap, (-v, i))

        ans = []
       

        while k > 0:
            idx,val = heapq.heappop(heap)
            ans.append(val)
            k -= 1

        return ans
        