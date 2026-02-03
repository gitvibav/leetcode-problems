class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        max_heap = []

        for x,y in points:
            res = -(x ** 2 + y ** 2)
            heapq.heappush(max_heap, [res, x, y])
            if len(max_heap) > k:
                heapq.heappop(max_heap)
        
        ans = []

        for point in max_heap:
            ans.append([point[1],point[2]])

        return ans