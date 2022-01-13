def matchPairs(self,nuts, bolts, n):
 symbols = ['!', "#", '$', '%', '&', '*', '@', '^', '~']
 
 new_set = []
 
 for element in symbols:
     if element in nuts:
         new_set.append(element)
         
       for i in range(n):
           nuts[i], bolts[i] = new_set[i], new_set[i]