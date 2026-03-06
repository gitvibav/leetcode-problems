class Solution:
    def hIndex(self, citations: List[int]) -> int:
        paper = len(citations)
        citation_buckets = [0] * (paper + 1)

        for citation in citations:
            citation_buckets[min(citation, paper)] += 1

        cumulative_index = 0

        for h_index in range(paper, -1, -1):
            cumulative_index += citation_buckets[h_index]
            if cumulative_index >= h_index:
                return h_index