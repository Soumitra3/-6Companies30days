public class Q5 {
    int span[] = new int[n];
       Stack<Integer> st = new Stack<>();
       st.push(0);
       span[0] = 1;
       for(int i =1;i<n;i++)
       {
           while(!st.empty() && arr[i]>=arr[st.peek()])
           {
               st.pop();
           }
           if(st.size()==0)
           {
               span[i] = i+1;
           }
           else
           {
               span[i] = i-st.peek();
           }
           st.push(i);
       }
       return span;}
    
}
