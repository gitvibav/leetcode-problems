class Solution:
    def isValid(self, s: str) -> bool:

        stack = []
        
        for elem in s:
            if elem == '(' or elem == '[' or elem == '{':
                stack.append(elem)
            else:
                if len(stack) != 0 and elem == ')' and stack[-1] == '(':
                    stack.pop()
                elif len(stack) != 0 and elem == '}' and stack[-1] == '{':
                    stack.pop()
                elif len(stack) != 0 and elem == ']' and stack[-1] == '[':
                    stack.pop()
                else:
                    return False
        
        return len(stack) == 0