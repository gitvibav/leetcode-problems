class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        map = {}
        count = 0

        for i in range(len(A)):
            if A[i] == B[i]:
                map[A[i]] = map.get(A[i], 0) + 2
                count += 1
            else:
                map[A[i]] = map.get(A[i], 0) + 1
                map[B[i]] = map.get(B[i], 0) + 1

                if map[A[i]] == 2:
                    count += 1
                
                if map[B[i]] == 2:
                    count += 1

            A[i] = count

        return A


