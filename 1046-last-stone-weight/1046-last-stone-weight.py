class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        max_heap = []
        for stone in stones:
            heapq.heappush(max_heap, -stone)


        while len(max_heap) >= 2:
            a = -heapq.heappop(max_heap)
            b = -heapq.heappop(max_heap)

            print(a, b)

            if a == b:
                continue
            else:
                heapq.heappush(max_heap, b-a)
        
        if len(max_heap) == 1:
            return -max_heap[0]
        
        return 0
