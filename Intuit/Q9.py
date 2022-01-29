from ast import List


class Q9:
    def __init__(self):
        self.both = "B"
        self.pacific = "P"
        self.atlantic = "A"
        
    def getOcean(self, pos, heights):
        if pos[0] - 1 >= 0 and pos[0] + 1 < len(heights) and pos[1] - 1 >= 0 and pos[1] + 1 < len(heights[pos[0]]):
            return None
        elif pos[0] + 1 >= len(heights) and pos[1] - 1 < 0:
            return self.both
        elif pos[0] - 1 < 0 and pos[1] + 1 >= len(heights[pos[0]]):
            return self.both
        elif (pos[0] - 1 < 0 or pos[1] - 1 < 0) and (pos[0] + 1 >= len(heights) or pos[1] + 1 >= len(heights[pos[0]])):
            return self.both
        elif pos[0] - 1 < 0 or pos[1] - 1 < 0:
            return self.pacific
        elif pos[0] + 1 >= len(heights) or pos[1] + 1 >= len(heights[pos[0]]):
            return self.atlantic
        
    def getNeighbors(self, curPos, heights, moves):
        neighs = []
        for move in moves:
            if curPos[0] + move[0] >= 0 and curPos[0] + move[0] < len(heights) and curPos[1] + move[1] >= 0 and curPos[1] + move[1] < len(heights[curPos[0]]):
                neighs.append((curPos[0] + move[0], curPos[1] + move[1]))
                
        return neighs
    
    def dfs(self, pos, heights, moves):
        stack = [pos]
        visited = {}
        visiting = {pos : True}
        isPacific = False
        isAtlantic = False
        while stack:
            curPos = stack.pop()
            ocean = self.getOcean(curPos, heights)
            del visiting[curPos]
            visited[curPos] = True
            if ocean == self.both:
                return [pos[0], pos[1]]
            elif ocean == self.pacific:
                isPacific = True
            elif ocean == self.atlantic:
                isAtlantic = True
                
            if isPacific and isAtlantic:
                return [pos[0], pos[1]]
                
            for neigh in self.getNeighbors(curPos, heights, moves):
                if heights[neigh[0]][neigh[1]] <= heights[curPos[0]][curPos[1]] and neigh not in visited and neigh not in visiting:
                    stack.append(neigh)
                    visiting[neigh] = True
                    
        return None
            
            
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        moves = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        
        ans = []
        m = len(heights)
        n = len(heights[0])
        for i in range(m):
            for j in range(n):
                isPossible = self.dfs((i, j), heights, moves)
                if isPossible:
                    ans.append(isPossible)
                
        return ans
                    