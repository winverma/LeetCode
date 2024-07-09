object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      val map = nums.zipWithIndex.toMap

      val r = nums.indices.indexWhere( i => map.get(target - nums(i)).exists(_ != i))
      if (r == -1) Array(-1, -1) else Array(r, map(target - nums(r)))
    }
}