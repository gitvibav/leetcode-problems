class Solution:
    def removeDuplicates(self, s: str) -> str:
        elems = []

        for elem in s:
            if not elems:
                elems.append(elem)
            else:
                a = elems.pop()
                if a != elem:
                    elems.append(a)
                    elems.append(elem)
        
        return "".join(elems)
            
