def minInsAndDel(self, A, B, N, M):
       # code here
       if(N>M):
           x=N-M
           c=0
           for i in range(M):
              
               if A[i]!=B[i]:
                   if B[i] in A:
                       ind=A.index(B[i])
                       temp=A[i]
                       A[i]=A[ind]
                       A[ind]=temp
                       c+=2
                   else:        
                       A[i]=B[i]
                       c+=2    
           return x+c
       else:
           x=M-N
           c=0
           for i in range(N):
               
               if A[i]!=B[i]:
                   if B[i] in A:
                       ind=A.index(B[i])
                       temp=A[i]
                       A[i]=A[ind]
                       A[ind]=temp
                       c+=2
                   else:
                       A[i]=B[i]
                       c+=2
           return x+c
        