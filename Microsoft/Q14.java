public class Q14 {
    int target = abs(D), sum = 0, step = 0;
       
       while(sum < target || (sum-target)%2 != 0)
       {
           step++;
           sum += step;
       }
       return step;
   }


    
}
