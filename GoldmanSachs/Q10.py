arr = [1, 4, 2, 3, ... , 20, 10] 
 
def largest_ten_numbers(arr): 
	return sorted(arr)[len(arr) - 10 : len(arr)] 