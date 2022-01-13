from collections import defaultdict
class Solution:
   def Anagrams(self, words, n):
       d=defaultdict(list)
   
       for i,j in enumerate(words):
           j=str(sorted(e))
           d[j].append(words[i])
   
       res=[]
       for i in d.values():
           res.append(i)
       return res