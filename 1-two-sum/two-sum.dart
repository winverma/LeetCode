class Solution {

List<int> twoSum(List<int> nums, int target) {
  Map<int, dynamic> numMap = {};

  for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (numMap.containsKey(complement)) {
      return [numMap[complement], i];
    }
    numMap[nums[i]] = i;
  }

  return [];
}
}