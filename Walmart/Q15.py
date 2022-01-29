import math
class Q15:
    def divide(self, dividend: int, divisor: int) -> int:
        
        if(dividend == -2147483648 and divisor ==1):
            return -2147483648
        
        ans = (abs(dividend)//abs(divisor))
        if ans > (pow(2, 31)-1):
            return (pow(2,31) -1)
        elif ans < pow(-2, 31):
            return pow(-2, 31)
        
        if ((dividend<0 and divisor>0)  or  (dividend>0 and divisor<0)):
            return -ans
        
        return ans