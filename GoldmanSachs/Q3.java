public class Q3 {
    long prod=1;
       int j=0,n,k,ans=0;
       int [] a =new int[100];
       
       for(int i=0;i<n;i++){
           prod*=a[i];
           while(j<n&&prod>=k){
               prod/=a[j];
               j++;
           }
           ans+=(i-j+1);
       }
       return ans;
    
}
}