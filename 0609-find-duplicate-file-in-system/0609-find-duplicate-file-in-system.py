class Solution:
    def findDuplicate(self, paths: List[str]) -> List[List[str]]:
        dup_freq = {}

        for path in paths:
            elem = path.split(" ")
            root = elem[0]
            files = elem[1:]

            for file in files:
                elem1 = file.split("(")
                file_name = elem1[0]
                content = elem1[1]
                
                if content not in dup_freq:
                    dup_freq[content] = [root + "/" + file_name]
                else:
                    dup_freq.get(content).append(root + "/" + file_name)

        ans = []

        for k,v in dup_freq.items():
            if len(v) >= 2:
                ans.append(v)

        return ans