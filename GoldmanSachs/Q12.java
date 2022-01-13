public class Q12 {
    class Solution {
         Long squaresInChessBoard(Long N) {
            if(N == 1){
                return N;
            }
            Long ans = N*N;
            N--;
            while(N>1){
                ans += N*N;
                N--;    }
            return ++ans;
    
}
    }}