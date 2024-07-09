func twoSum(nums []int, target int) []int {
	i := 0
	j := len(nums) - 1
	for {
		if i == j {
            if j == 0 {
                return []int{}
            }

            j--
            i = 0
		}

		if nums[i]+nums[j] == target {
			return []int{i, j}
		}

        i++ 
	}
}