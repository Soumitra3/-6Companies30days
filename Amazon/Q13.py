def add_neighbors_to_q(self,i, j, q, grid):
        cnt = 0
        if i > 0 and grid[i - 1][j] == 1:
            q.append((i - 1, j))
            grid[i - 1][j] = 2
            cnt += 1
        if j > 0 and grid[i][j - 1] == 1:
            q.append((i, j - 1))
            grid[i][j - 1] = 2
            cnt += 1
        if i < len(grid) - 1 and grid[i + 1][j] == 1:
            q.append((i + 1, j))
            grid[i + 1][j] = 2
            cnt += 1
        if j < len(grid[0]) - 1 and grid[i][j + 1] == 1:
            q.append((i, j + 1))
            grid[i][j + 1] = 2
            cnt += 1
        return cnt

    def orangesRotting(self,grid: List[List[int]]) -> int:
            fresh_cnt = time_cnt = 0
            q = []
            for i in range(len(grid)):
                for j in range(len(grid[0])):
                    if grid[i][j] == 1:
                        fresh_cnt += 1
                    elif grid[i][j] == 2:
                        q.append((i, j))
                        grid[i][j] = 3
            if fresh_cnt == 0:
                return 0
            while len(q):  # while q:
                for x in range(len(q)):
                    i, j = q.pop(0)
                    fresh_cnt -= self.add_neighbors_to_q(i, j, q, grid)
                time_cnt += 1
                if fresh_cnt == 0:
                    return time_cnt
            return -1