class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.mapIndexed { index, num ->
            if (target - num in map) return intArrayOf(map.getValue(target - num), index)
            map.put(num, index)
        }
        return IntArray(0)
    }
}