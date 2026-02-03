class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        vals = Counter(tasks)
        maxHeap = [-cnt for cnt in vals.values()]
        heapq.heapify(maxHeap)

        time = 0
        q = Deque()

        while maxHeap or q:
            time += 1

            if maxHeap:
                elem = 1 + heapq.heappop(maxHeap)
                if elem:
                    q.append([elem, time+n])

            if q and q[0][1] == time:
                heapq.heappush(maxHeap, q.popleft()[0])
        
        return time
