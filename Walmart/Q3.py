class Q3:
       def winnerOfGame(self, colors: str) -> bool:
        aliceMoves = 0
        bobMoves = 0
        consecutiveA = 0
        consecutiveB = 0
        
        for color in colors:
            if color == "A":
                consecutiveA += 1
                consecutiveB = 0
            else:
                consecutiveA = 0
                consecutiveB += 1
            
            if consecutiveA >= 3:
                aliceMoves += 1
            
            if consecutiveB >= 3:
                bobMoves += 1
            
        return aliceMoves > bobMoves