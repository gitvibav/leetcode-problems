class Solution:
    def validateStackSequences(self, pushed: List[int], popped: List[int]) -> bool:
        stack = []
        k = 0

        for num in pushed:
            stack.append(num)
            while stack and stack[-1] == popped[k]:
                stack.pop()
                k += 1

        return True if len(stack) == 0 else False