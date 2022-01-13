class Solution:
def getNthUglyNo(self,n):
 arr=[1]
 p2=0
 p3=0
 p5=0
 for i in range(2,n+1):
    num2=arr[p2]*2
    num3=arr[p3]*3
    num5=arr[p5]*5
    res=min(num2,num3,num5)
    arr.append(res)
    if(res==num2):
        p2+=1
    if(res==num3):
        p3+=1
    if(res==num5):
        p5+=1
 return arr[n-1]