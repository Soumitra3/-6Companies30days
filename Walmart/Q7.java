public class Q7 {
        ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
            
            int count=1;
            Stack<Integer>st=new Stack<>();
            for(int i=n-1;i>=0;i--)
            {
                if(!st.empty())
                {
                    if(st.peek()<=arr.get(i))
                    {
                        while(!st.empty()&&st.peek()<=arr.get(i))
                          st.pop();
                         st.push(arr.get(i));
                         if(st.size()==3)
                           break;
                    }
                    else
                    {
                        st.push(arr.get(i));
                        if(st.size()==3)
                          break;
                    }
                }
                else
                   st.push(arr.get(i));
            }
            ArrayList<Integer> ans=new ArrayList<>();
            if(st.size()==3)
            {
                ans.add(st.peek());
                st.pop();
                ans.add(st.peek());
                st.pop();
                ans.add(st.peek());
                st.pop();
                
            }
            return ans;
            
        }
    }
    
