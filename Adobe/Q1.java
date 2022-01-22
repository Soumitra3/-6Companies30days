public class Q1{
    public static void main(String[]args){
    int l=0;
    long long sum=0;
    for(int i=0;i<n;i++){
     sum+=arr[i];
      while(sum>=s){
        if(sum==s){
            return vector<int>{l+1,i+1};
        }
        sum-=arr[l];
        l++;
    }
    
}
return vector<int>{-1};
}}