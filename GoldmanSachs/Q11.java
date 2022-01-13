public class Q11 {
    class Solve {
        int[] findTwoElement(int arr[], int n) {
            int[] b = new int[n+1]; int rep=0;
            for(int i = 0;i<arr.length;i++){
                b[arr[i]] += 1;
                if(b[arr[i]] == 2) rep = arr[i];
            }
            for(int i = 1;i<n+1;i++) if(b[i] == 0) return new int[]{rep,i};
            return new int[]{0,0};
        }
     }
}
