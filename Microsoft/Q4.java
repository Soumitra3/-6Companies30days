public class Q4 {
    vector<int>v;
        int top = 0, bottom = r-1, right = c-1, left = 0;
        
        while(top<=bottom && right>=left) {
            for(int i=left;i<=right;i++) {
                v.push_back(mat[top][i]); //  
            } top++;
            for(int i = top;i<=bottom;i++) {
                v.push_back(mat[i][right]);// 
            } right--;
            if(top<=bottom) {
                for(int i=right; i>=left;i--) {
                    v.push_back(mat[bottom][i]); // 
                } bottom--;
            }
            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    v.push_back(mat[i][left]);// 
                } left++;
            }
}
}}