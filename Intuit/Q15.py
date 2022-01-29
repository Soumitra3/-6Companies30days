class Q15(object):
	def minEatingSpeed(self, piles, h):
		"""
		:type piles: List[int]
		:type h: int
		:rtype: int
		"""
		piles_len = len(piles)
		def get_hours(piles, eating_speed):
			hours = 0
			for pile in piles: 
				if pile % eating_speed == 0: 
					hours += pile//eating_speed
				elif pile % eating_speed != 0: 
					hours += pile//eating_speed + 1  
			return hours           

		left, right = 1, max(piles)
		while left<=right:
			eating_speed = left + (right-left)//2
			hours = get_hours(piles, eating_speed)
			if hours>h:
				left = eating_speed + 1
			elif hours<=h: 
				if eating_speed == 1:
					return eating_speed   
				else:                      
					test_hours = get_hours(piles, eating_speed-1)
					if test_hours>h: 
						return eating_speed 
					elif test_hours<=h:  
						right = eating_speed - 1