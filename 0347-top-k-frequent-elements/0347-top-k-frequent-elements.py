class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        maxHeap = []
        freq = Counter(nums)

        for key,val in freq.items():
            heapq.heappush(maxHeap, (-val,key))

        ans = []

        while k > 0:
            val2,key2 = heapq.heappop(maxHeap)
            ans.append(key2)
            k -= 1

        return ans
        
