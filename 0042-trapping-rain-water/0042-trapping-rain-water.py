class Solution:
    def trap(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        lMax = height[left]
        rMax = height[right]
        water = 0

        while (left < right):
            if (lMax < rMax):
                left += 1
                lMax = max(lMax, height[left])
                water += (lMax - height[left])
            else:
                right -= 1
                rMax = max(rMax, height[right])
                water += (rMax - height[right])
        
        return water