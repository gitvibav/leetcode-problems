class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        buckets = {}

        for num in nums:
            if num in buckets:
                buckets[num] += 1
            else:
                buckets[num] = 1

        heap = []

        for key,v in buckets.items():
            heapq.heappush(heap, (-v, key))

        ans = []
        while k > 0:
            v,key = heapq.heappop(heap)
            ans.append(key)
            k -= 1

        return ans