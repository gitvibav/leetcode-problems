class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        elems = sorted(zip(position, speed), key=lambda x: x[0], reverse=True)
        fleet = []

        for pos, spd in elems:
            time = (target - pos) / spd
            if not fleet or time > fleet[-1]:
                fleet.append(time)
        
        return len(fleet)