public class Q11 {
    string amendSentence (string s)
   {
       string ans="";
       
       int len=s.length();
       int i=0;
       
       while(i<len)
       {
           if(i==0 || isupper(s[i]))
           {
               ans+=tolower(s[i]);
               i++;
               while(i<len && islower(s[i]))
               {
                   ans+=s[i];
                   i++;
               }
               ans+=" ";
           }
       }
       
       ans.pop_back();
       return ans;
   }
    
}
